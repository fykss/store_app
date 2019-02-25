package dao;

import entity.User;
import exception.UserNotFoundException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class DAOUserSQL implements DAO<User> {
    private Connection conn;
    private User user;


    public DAOUserSQL(Connection conn) {
        this.conn = conn;
    }

    public DAOUserSQL(Connection conn, String login, String password) {
        this.conn = conn;
        user = new User(login, password);
    }

    @Override
    public User get(int id) {
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from vlad_users where id = ?");
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                return new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("password"));
            } else {
                throw new UserNotFoundException();
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException("smth went wrong", e);
        }
    }

    @Override
    public Collection<User> all() {
        try {
            ArrayList<User> users = new ArrayList<>();
            PreparedStatement stmt = conn.prepareStatement("select * from vlad_users");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                User user = new User(resultSet.getInt("id"),
                        resultSet.getString("login"),
                        resultSet.getString("password"));
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            throw new IllegalArgumentException("smth went wrong", e);
        }
    }

    @Override
    public void put(User user) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into vlad_users(login, password) value (?, ?)");
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPassword());
            ps.execute();
        } catch (SQLException e) {
            throw new IllegalArgumentException("smth went wrong", e);
        }
    }

    public int getByLogin() {
        try {
            PreparedStatement ps = conn.prepareStatement("select id from vlad_users where login = ? and password = ?");
            ps.setString(1,user.getLogin());
            ps.setString(2,user.getPassword());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                user.setId(rs.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user.getId();
    }

    public boolean check() {
        String login = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select login from vlad_users where login = ? ");
            ps.setString(1,user.getLogin());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                login = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user.getLogin().equals(login);
    }
}
