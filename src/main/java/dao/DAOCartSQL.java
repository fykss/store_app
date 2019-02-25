package dao;

import entity.Cart;

import java.sql.Connection;
import java.util.Collection;

public class DAOCartSQL implements DAO<Cart> {
    private Connection conn;

    public DAOCartSQL(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Cart get(int id) {
        return null;
    }

    @Override
    public void put(Cart ent) {

    }

    @Override
    public Collection<Cart> all() {
        return null;
    }
}
