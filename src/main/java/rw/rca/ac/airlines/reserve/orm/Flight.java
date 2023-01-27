package rw.rca.ac.airlines.reserve.orm;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;
import java.util.*;
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    @Column(name = "id", nullable = false)

    private int code;
    private String departure;
    private String destination;
    private Date departureTime;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "pilot_id")
//    private Pilot pilot;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Pilot pilot;
    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = Passenger.class)
    @JoinTable(name="flight_passenger",joinColumns = { @JoinColumn(name = "flight_id")},inverseJoinColumns ={@JoinColumn(name = "passenger_id")} )
    private List<Passenger> passengers;

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    private boolean isCanceled;
    private int limitValue;
    private double price;
    public Flight(int code, String departure, String destination, Date departureTime, boolean isCanceled, int limitValue, double price) {
        this.code = code;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.isCanceled = isCanceled;
        this.limitValue = limitValue;
        this.price = price;
    }
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
    public boolean isCanceled() {
        return isCanceled;
    }
    public void setCanceled(boolean isCanceled) {
        this.isCanceled = isCanceled;
    }
    public int getLimit() {
        return limitValue;
    }
    public void setLimit(int limit) {
        this.limitValue = limit;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    

}
