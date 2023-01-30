package rw.rca.ac.airlines.reserve.dao.definition;

import java.util.List;

import rw.rca.ac.airlines.reserve.orm.Flight;

public interface FlightDAO {
    public void saveFlight(Flight flight);
    public void updateFlight();
    public void deleteFlight(Flight flight);
    public List<Flight> findFlight(String name);
}
