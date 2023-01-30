package rw.rca.ac.airlines.reserve.dao.definition;

import java.util.List;

import rw.rca.ac.airlines.reserve.orm.Passenger;

public interface PassengerDAO {
    public void savePassenger(Passenger passenger);
    public void updatePassenger(Passenger passenger);
    public void deletePassenger(Passenger passenger);
    public List<Passenger> findPassenger(String name);
}
