package rw.rca.ac.airlines.reserve.orm;

import java.util.*;

public class Flight {
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

    

}
