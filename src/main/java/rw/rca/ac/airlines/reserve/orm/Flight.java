package rw.rca.ac.airlines.reserve.orm;

import java.sql.SQLException;
import java.util.*;

import rw.rca.ac.airlines.reserve.orm.DAOImplentation.T;
import rw.rca.ac.airlines.reserve.orm.Interface.DAO;

public class Flight implements DAO<T> {
    public Flight(int code, String departure, String destination, Date departureTime, Pilot pilot,
            ArrayList<Passenger> passengers, boolean isCanceled, int limit, double price) {
        this.code = code;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.pilot = pilot;
        this.passengers = passengers;
        this.isCanceled = isCanceled;
        this.limit = limit;
        this.price = price;
    }

    public Flight(int i, String string, String string2, double d, boolean b, int j, double e) {
    }

    public Flight(int code2, String departure2, String destination2, double d, String string, String string2,
            boolean isCanceled2, int limit2, double price2) {
    }

    @Override
    public String toString() {
        return "Flight [id=" + id + ", code=" + code + ", departure=" + departure + ", destination=" + destination
                + ", departureTime=" + departureTime + ", pilot=" + pilot + ", passengers=" + passengers
                + ", isCanceled=" + isCanceled + ", limit=" + limit + ", price=" + price + "]";
    }

    private int id;
    private int code;
    private String departure;
    private String destination;
    private Date departureTime;
    private Pilot pilot;
    private ArrayList<Passenger> passengers;
    private boolean isCanceled;
    private int limit;
    private double price;

    public int getId() {
        return id;
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

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean isCanceled) {
        this.isCanceled = isCanceled;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int save(T t) throws SQLException {
        return 0;
    }

    @Override
    public int insert(T t) throws SQLException {
        return 0;
    }

    @Override
    public int update(T t) throws SQLException {
        return 0;
    }

    @Override
    public int delete(T t) {
        return 0;
    }

    @Override
    public T get(int id) throws SQLException {
        return null;
    }

}
