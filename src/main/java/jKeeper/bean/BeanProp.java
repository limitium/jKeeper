package jKeeper.bean;


import jKeeper.annotation.ColumnType;

public class BeanProp {
    private String fieldName;
    private String columnName;

    private String setter;
    private String getter;

    private Class type;
    private boolean skipped;
    private boolean id;



    private ColumnType columnType;

    public BeanProp(String fieldName) {
        this.fieldName = fieldName;
        this.id = false;
        this.skipped = false;
    }

    public boolean isSkipped() {
        return skipped;
    }

    public void setSkipped(boolean skipped) {
        this.skipped = skipped;
    }

    public String getSetter() {
        return setter;
    }

    public void setSetter(String setter) {
        this.setter = setter;
    }

    public boolean isId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }

    public String getFieldName() {
        return fieldName;
    }


    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getColumnName() {

        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public void setColumnType(ColumnType columnType) {
        this.columnType = columnType;
    }

    public ColumnType getColumnType() {
        return columnType;
    }
}
