package rw.rca.ac.airlines.reserve.orm;

import java.sql.SQLException;

import org.apache.poi.hssf.record.formula.functions.T;

import Interface.DAO;

public class Seat implements DAO<T> {
    private int id;
    private int code;
    private Category category;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Seat [id=" + id + ", code=" + code + ", category=" + category + "]";
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seat(int code, Category category) {
        this.code = code;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
