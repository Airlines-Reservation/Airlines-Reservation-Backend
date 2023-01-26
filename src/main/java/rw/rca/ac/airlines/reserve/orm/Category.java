package rw.rca.ac.airlines.reserve.orm;

import java.sql.SQLException;

import Interface.DAO;
import rw.rca.ac.airlines.reserve.orm.DAOImplentation.T;

public class Category implements DAO<T> {
    private int id;
    private String name;
    private String serveces;
    private double price;

    public Category(String name, String serveces, double price) {
        this.name = name;
        this.serveces = serveces;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", serveces=" + serveces + ", price=" + price + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServeces() {
        return serveces;
    }

    public void setServeces(String serveces) {
        this.serveces = serveces;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public T get(int id) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int save(T t) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int insert(T t) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(T t) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(T t) {
        // TODO Auto-generated method stub
        return 0;
    }

}
