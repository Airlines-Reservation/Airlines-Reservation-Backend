package rw.rca.ac.airlines.reserve.controllers;

import rw.rca.ac.airlines.reserve.dao.DAO;
import rw.rca.ac.airlines.reserve.enums.EmployeeDepartment;
import rw.rca.ac.airlines.reserve.enums.EmployeeStatus;
import rw.rca.ac.airlines.reserve.orm.Employee;
import rw.rca.ac.airlines.reserve.orm.Flight;
import rw.rca.ac.airlines.reserve.orm.Passenger;
import rw.rca.ac.airlines.reserve.orm.Pilot;

import java.util.Date;
import java.util.List;

public class FlightController
{
    DAO<Flight> flightDAO = new DAO<Flight>(Flight.class);
    DAO<Employee> employeeDAO = new DAO<Employee>(Employee.class);
    DAO<Passenger> passengerDAO = new DAO<Passenger>(Passenger.class);
    public void createFlight() {
        Employee pilot = new Employee("Moni","Manzi","Rwandan",new Date(03,02,2004),EmployeeDepartment.PILOT, EmployeeStatus.ACTIVE,"PIT1323");
        Passenger passenger = new Passenger("Manzi", "Cedrick", "Rwandan", new Date(12, 02, 2000));
        Flight flight = new Flight(123, "Kigali", "Angola", new Date(12, 02, 2022), false, 200, 29149.50);
        this.passengerDAO.create(passenger);
        this.employeeDAO.create(pilot);
        this.flightDAO.create(flight);
        System.out.println("DONE!");
    }
    public List<Flight> getAllFlights() {
        List<Flight> fls;
        return this.flightDAO.getAll();
    }
}
