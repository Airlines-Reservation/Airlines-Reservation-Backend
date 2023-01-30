package rw.rca.ac.airlines.reserve.dao.definition;

import rw.rca.ac.airlines.reserve.orm.Seat;
import java.util.List;

public interface SeatDAO {
    public void saveSeat(Seat seat);
    public void updateSeat(Seat seat);
    public void deleteSeat(Seat seat);
    public List<Seat> findSeat(String name);
}
