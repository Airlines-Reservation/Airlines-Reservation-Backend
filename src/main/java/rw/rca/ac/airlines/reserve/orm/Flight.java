package rw.rca.ac.airlines.reserve.orm;

public class Flight {
    private int id;
    private String flightName;
    private int flightCode;

    public Flight(String flightName, int flightCode) {
        this.flightName = flightName;
        this.flightCode = flightCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(int flightCode) {
        this.flightCode = flightCode;
    }
}
