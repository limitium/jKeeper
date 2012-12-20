package jKeeper.db;

import jKeeper.Keeper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;


public abstract class Command extends LinkedHashMap {
    private final String sql;
    private final Keeper keeper;

    public Command(Keeper keeper, String sql) {
        super();
        this.sql = sql;
        this.keeper = keeper;
    }

    @Override
    public Command put(Object key, Object value) {
        super.put(key, value);
        return this;
    }

    public abstract void work(ResultSet rs) throws SQLException;

    public Command execute() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        Statement st = null;
        try {
            conn = keeper.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            rs.getMetaData();
            while (rs.next()) {
                work(rs);
            }
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            keeper.close(conn, st, rs);
        }
        return this;
    }
}
