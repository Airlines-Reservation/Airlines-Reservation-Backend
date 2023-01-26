package rw.rca.ac.airlines.reserve.orm;

import java.sql.SQLException;
import java.util.Date;

import Interface.DAO;
import rw.rca.ac.airlines.reserve.orm.DAOImplentation.T;

public class Passenger extends Person implements DAO<T> {
    private int passportId;

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public Passenger(String firstName, String lastName, String nationality, Date dob, int passportId) {
        super(firstName, lastName, nationality, dob);
        this.passportId = passportId;
    }

    @Override
    public String toString() {
        return "Passenger [passportId=" + passportId + "]";
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
