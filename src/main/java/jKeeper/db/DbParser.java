package jKeeper.db;

import jKeeper.bean.BeanProp;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;


public class DbParser {
    public static HashMap<String, BeanProp> getColumns(ResultSetMetaData md, HashMap<String, BeanProp> props) throws SQLException {
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
}
