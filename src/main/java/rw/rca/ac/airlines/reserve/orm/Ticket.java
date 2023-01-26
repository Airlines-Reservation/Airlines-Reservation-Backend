package rw.rca.ac.airlines.reserve.orm;

import java.sql.SQLException;
import java.util.*;

import Interface.DAO;
import rw.rca.ac.airlines.reserve.orm.DAOImplentation.T;

public class Ticket implements DAO<T> {
    private int id;
    private int code;
    private Passenger owner;
    private int flightId;
    private Date issueDate;
    private Date expirationDate;
    private Seat seat;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + ", code=" + code + ", owner=" + owner + ", flightId=" + flightId + ", issueDate="
                + issueDate + ", expirationDate=" + expirationDate + ", seat=" + seat + "]";
    }

    public Ticket(int code, Passenger owner, int flightId, Date issueDate, Date expirationDate, Seat seat) {
        this.code = code;
        this.owner = owner;
        this.flightId = flightId;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.seat = seat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Passenger getOwner() {
        return owner;
    }

    public void setOwner(Passenger owner) {
        this.owner = owner;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
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
