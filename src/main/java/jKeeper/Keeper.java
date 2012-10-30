package jKeeper;

import jKeeper.annotation.*;
import jKeeper.bean.BeanProp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class Keeper {
    private static final Logger logger = LoggerFactory.getLogger(Keeper.class);
    private DataSource dataSource;

    public Keeper(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException sqle) {
            logger.error(sqle.getMessage(), sqle);
        }
    }

    public static void close(Statement statement) {
        try {
            if (statement != null)
                statement.close();
        } catch (SQLException sqle) {
            logger.error(sqle.getMessage(), sqle);
        }
    }

    public static void close(PreparedStatement statement) {
        try {
            if (statement != null)
                statement.close();
        } catch (SQLException sqle) {
            logger.error(sqle.getMessage(), sqle);
        }
    }

    public static void close(ResultSet rst) {
        try {
            if (rst != null)
                rst.close();
        } catch (SQLException sqle) {
            logger.error(sqle.getMessage(), sqle);
        }
    }


    public static void close(Connection conn, ResultSet rst) {
        close(conn);
        close(rst);
    }

    public static void close(Connection conn, PreparedStatement pst, ResultSet rst) {
        close(conn);
        close(pst);
        close(rst);
    }

    public static void close(Connection conn, Statement pst, ResultSet rst) {
        close(conn);
        close(pst);
        close(rst);
    }

    public static void close(Connection conn, PreparedStatement pst) {
        close(conn);
        close(pst);
    }

    public <T> List<T> list(String sql, Class<T> type) throws SQLException {
        ArrayList<T> list = new ArrayList<T>();
        Connection connection = this.getConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        try {
            HashMap<String, BeanProp> cols = this.getColumns(rs.getMetaData(), this.getProps(type));
            while (rs.next()) {
                list.add(this.createBean(type, rs, cols));
            }
        } catch (SQLException e) {
            logger.error(e.getMessage());
            throw new SQLException(e.getMessage());
        } finally {
            Keeper.close(connection, st, rs);
        }
        return list;
    }

    public <T> T one(String sql, Class<T> type) throws SQLException {
        Connection connection = this.getConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        T bean = null;
        try {
            rs.next();
            bean = this.createBean(type, rs, this.getColumns(rs.getMetaData(), this.getProps(type)));
        } catch (SQLException e) {
            logger.error(e.getMessage());
            throw new SQLException(e.getMessage());
        } finally {
            Keeper.close(connection, st, rs);
        }
        return bean;
    }

    private <T> T createBean(Class<T> type, ResultSet rs, HashMap<String, BeanProp> columns) throws SQLException {
        T bean = this.newInstance(type);
        String getterName = "";
        for (BeanProp column : columns.values()) {
            try {

                getterName = "get" + Keeper.UppercaseFirstLetters(column.getType().getSimpleName());
                Method getter = ResultSet.class.getMethod(getterName, String.class);

                Method setter = type.getDeclaredMethod(column.getSetter(), column.getType());
                setter.invoke(bean, getter.invoke(rs, column.getColumnName()));

//by field
//                Field field = type.getDeclaredField(column.getFieldName());
//                field.setAccessible(true);
//                field.set(bean, getter.invoke(rs, column.getColumnName()));

            } catch (InvocationTargetException e) {
                throw new SQLException(
                        "Wrong target for " + getterName + " with " + column.getColumnName() + " : " + e.getLocalizedMessage());
            } catch (NoSuchMethodException e) {
                throw new SQLException(
                        "Method not found " + getterName + ": " + e.getLocalizedMessage());
//            } catch (NoSuchFieldException e) {
//                throw new SQLException(
//                        "Field not found " + column.getFieldName() + ": " + e.getLocalizedMessage());
            } catch (IllegalAccessException e) {
                throw new SQLException(
                        "Cant access rs getter " + getterName + ": " + e.getLocalizedMessage());
            }
        }
        return bean;
    }

    private HashMap<String, BeanProp> getColumns(ResultSetMetaData md, HashMap<String, BeanProp> props) throws SQLException {
        HashMap<String, BeanProp> columns = new HashMap<String, BeanProp>();
        int cols = md.getColumnCount();
        for (int col = 1; col <= cols; col++) {
            String columnName = md.getColumnLabel(col);
            if (null == columnName || 0 == columnName.length()) {
                columnName = md.getColumnName(col);
            }
            for (BeanProp prop : props.values()) {
                if (prop.getColumnName().toLowerCase().equals(columnName.toLowerCase())) {
                    columns.put(columnName, prop);
                }
            }
        }
        return columns;
    }

    private <T> HashMap<String, BeanProp> getProps(Class<T> type) {
        HashMap<String, BeanProp> props = new HashMap<String, BeanProp>();
        for (Field f : type.getDeclaredFields()) {

            if (Modifier.isStatic(f.getModifiers())) {
                //skip static
                continue;
            }
            BeanProp beanProp = new BeanProp(f.getName());
            beanProp.setColumnName(beanProp.getFieldName());
            beanProp.setSetter("set" + UppercaseFirstLetters(beanProp.getFieldName()));
            beanProp.setGetter("get" + UppercaseFirstLetters(beanProp.getFieldName()));
            beanProp.setType(f.getType());
            for (Annotation a : f.getAnnotations()) {
                if (a.annotationType() == Skip.class) {
                    beanProp.setSkipped(true);
                }
                if (a.annotationType() == Id.class) {
                    beanProp.setId(true);
                }
                if (a.annotationType() == Column.class) {
                    beanProp.setColumnName(((Column) a).value());
                }
                if (a.annotationType() == Setter.class) {
                    beanProp.setSetter(((Setter) a).value());
                }
                if (a.annotationType() == Getter.class) {
                    beanProp.setSetter(((Getter) a).value());
                }
            }
            props.put(f.getName(), beanProp);
        }
        return props;
    }

    private <T> T newInstance(Class<T> c) throws SQLException {
        try {
            return c.newInstance();

        } catch (InstantiationException e) {
            throw new SQLException(
                    "Cannot create " + c.getName() + ": " + e.getMessage());

        } catch (IllegalAccessException e) {
            throw new SQLException(
                    "Cannot create " + c.getName() + ": " + e.getMessage());
        }
    }


    public int insert(Object ad) throws SQLException {
        HashMap<String, BeanProp> props = getProps(ad.getClass());
        List<String> columns = new ArrayList<String>();
        String values = "";
        boolean firstVal = true;
        for (BeanProp prop : props.values()) {
            if (!prop.isSkipped() && !prop.isId()) {
                columns.add(prop.getColumnName());
                try {
                    Method getter = ad.getClass().getDeclaredMethod(prop.getGetter());
                    if (!firstVal) {
                        values += ",";
                    }
                    boolean withBrace = true;
                    values += "'" + getter.invoke(ad) + "'";
                    firstVal = false;
                } catch (NoSuchMethodException e) {
                    logger.error(e.getMessage());
                    throw new SQLException(
                            "Getter not found " + prop.getGetter() + ": " + e.getLocalizedMessage());
                } catch (InvocationTargetException e) {
                    logger.error(e.getMessage());
                    throw new SQLException(
                            "Cant invoke getter" + prop.getGetter() + ": " + e.getLocalizedMessage());
                } catch (IllegalAccessException e) {
                    logger.error(e.getMessage());
                    throw new SQLException(
                            "Cant access getter" + prop.getGetter() + ": " + e.getLocalizedMessage());
                }
            }
        }
        String sql = "INSERT INTO " + getTable(ad.getClass()) + " ([" + StringUtils.join(columns, "],[") + "]) values (" + values + ")";
        System.out.println(sql);
        return getConnection().prepareStatement(sql).executeUpdate();
    }

    private String getTable(Class type) {
        String table = type.getSimpleName();
        Annotation annotationTable = type.getAnnotation(Table.class);
        if (annotationTable != null) {
            table = ((Table) annotationTable).value();
        }
        return table;
    }

    public static String UppercaseFirstLetters(String str) {
        char[] chars = str.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
}
