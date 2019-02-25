package dao;

import entity.User;

import java.util.Collection;

public interface DAO<T> {
    T get(int id);
    void put(T ent);
    Collection<T> all();
}
