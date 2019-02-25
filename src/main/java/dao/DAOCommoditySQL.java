package dao;

import entity.Commodity;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class DAOCommoditySQL implements DAO<Commodity> {
    private Connection conn;

    public DAOCommoditySQL(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Commodity get(int id) {
        return null;
    }

    @Override
    public void put(Commodity ent) {

    }

    @Override
    public Collection<Commodity> all() {
        try {
            ArrayList<Commodity> commodities = new ArrayList<>();
            PreparedStatement commodity = conn.prepareStatement("select * from vlad_commodity");
            ResultSet resultSet = commodity.executeQuery();
            while (resultSet.next()) {
                Commodity commodity1 = new Commodity(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("price"));
                commodities.add(commodity1);
            }
            return commodities;
        } catch (SQLException e) {
            throw new IllegalArgumentException("smth went wrong", e);
        }
    }
}
