package jKeeperTest.model;


import jKeeper.annotation.*;

@Table("Qwe")
public class Ololo {
    @Setter("setSSSString1")
    @Getter("getSSSString1")
    private String string1;
    @Type(ColumnType.INT)
    private String string2;
    @Type(ColumnType.DATE)
    private String string3;
    @Id
    @Column("Id")
    private int superId;
    @Skip
    private int skipped;

    public String getSSSString1() {
        return string1;
    }

    public void setSSSString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public String getString3() {
        return string3;
    }

    public void setString3(String string3) {
        this.string3 = string3;
    }

    public int getSuperId() {
        return superId;
    }

    public void setSuperId(int superId) {
        this.superId = superId;
    }
}
