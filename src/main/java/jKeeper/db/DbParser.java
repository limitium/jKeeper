package jKeeper.db;

import jKeeper.bean.BeanProp;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


public class DbParser {
    public static ArrayList<String> getColumns(ResultSetMetaData md) throws SQLException {
        ArrayList<String> columns = new ArrayList<String>();
        int cols = md.getColumnCount();
        for (int col = 1; col <= cols; col++) {
            columns.add(md.getColumnName(col));
        }
        return columns;
    }

    public static HashMap<String, BeanProp> getColumns(ResultSetMetaData md, HashMap<String, BeanProp> props) throws SQLException {
        HashMap<String, BeanProp> columns = new HashMap<String, BeanProp>();
        for (String columnName : getColumns(md)) {
            for (BeanProp prop : props.values()) {
                if (prop.getColumnName().toLowerCase().equals(columnName.toLowerCase())) {
                    columns.put(columnName, prop);
                }
            }
        }
        return columns;
    }
}
