package rw.rca.ac.airlines.reserve.controllers;

import rw.rca.ac.airlines.reserve.dao.DAO;
import rw.rca.ac.airlines.reserve.orm.Flight;
import rw.rca.ac.airlines.reserve.orm.Passenger;
import rw.rca.ac.airlines.reserve.orm.Pilot;

import java.util.Date;
import java.util.List;

public class FlightController
{
    DAO<Flight> flightDAO = new DAO<Flight>(Flight.class);
    DAO<Pilot> pilotDAO = new DAO<Pilot>(Pilot.class);
    DAO<Passenger> passengerDAO = new DAO<Passenger>(Passenger.class);
    public void createFlight() {
        Passenger passenger = new Passenger("Manzi", "Cedrick", "Rwandan", new Date(12, 02, 2000));
        Pilot pilot = new Pilot("Iris", "Ngabo", "Rwandan", new Date(12, 04, 2008), 2120);
        Flight flight = new Flight(123, "Kigali", "Angola", new Date(12, 02, 2022), false, 200, 29149.50);
        this.passengerDAO.create(passenger);
        this.pilotDAO.create(pilot);
        this.flightDAO.create(flight);
        System.out.println("DONE!");
    }
    public List<Flight> getFlight() {
        List<Flight> fls;
        return this.flightDAO.getAll();
    }
}
