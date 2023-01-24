package rw.rca.ac.airlines.reserve.orm;

import java.util.*;

public class Ticket {
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

    
}
