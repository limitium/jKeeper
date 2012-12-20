package jKeeper.bean;

import jKeeper.annotation.*;
import org.apache.commons.lang.StringUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;


public class BeanParser {
    private Class type;

    public BeanParser(Class type) {
        this.type = type;
    }

    public <T> HashMap<String, BeanProp> getProps() {
        return getProps(null);
    }

    public <T> HashMap<String, BeanProp> getProps(HashMap<String, String> columnMapper) {
        HashMap<String, BeanProp> props = new HashMap<String, BeanProp>();
        for (Field f : type.getDeclaredFields()) {

            if (Modifier.isStatic(f.getModifiers())) {
                //skip static
                continue;
            }
            BeanProp beanProp = new BeanProp(f.getName());
            beanProp.setColumnName(beanProp.getFieldName());
            beanProp.setSetter("set" + StringUtils.capitalize(beanProp.getFieldName()));
            beanProp.setGetter("get" + StringUtils.capitalize(beanProp.getFieldName()));
            beanProp.setType(f.getType());
            beanProp.setColumnType(getColumnType(f.getType()));
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
                    beanProp.setGetter(((Getter) a).value());
                }
                if (a.annotationType() == Type.class) {
                    beanProp.setColumnType(((Type) a).value());
                }
            }

            if (columnMapper != null && columnMapper.containsKey(f.getName())) {
                beanProp.setColumnName(columnMapper.get(f.getName()));
            }
            props.put(f.getName(), beanProp);
        }
        return props;
    }

    private ColumnType getColumnType(Class<?> type) {
        if (type.equals(int.class) || type.equals(Integer.class)) {
            return ColumnType.INT;
        }
        return ColumnType.VARCHAR;
    }

    public String getTable() {
        String table = type.getSimpleName();
        Annotation annotationTable = type.getAnnotation(Table.class);
        if (annotationTable != null) {
            table = ((Table) annotationTable).value();
        }
        return table;
    }
}
