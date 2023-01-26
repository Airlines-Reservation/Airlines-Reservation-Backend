package rw.rca.ac.airlines.reserve.orm;

import java.sql.SQLException;
import java.util.Date;

import Interface.DAO;
import rw.rca.ac.airlines.reserve.orm.DAOImplentation.T;

public class Pilot extends Person implements DAO<T> {
    private int pilotCode;

    public int getPilotCode() {
        return pilotCode;
    }

    public Pilot(String firstName, String lastName, String nationality, Date dob, int pilotCode) {
        super(firstName, lastName, nationality, dob);
        this.pilotCode = pilotCode;
    }

    public void setPilotCode(int pilotCode) {
        this.pilotCode = pilotCode;
    }

    @Override
    public String toString() {
        return "Pilot [pilotCode=" + pilotCode + "]";
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
