package rw.rca.ac.airlines.reserve.dao.definition;

import rw.rca.ac.airlines.reserve.orm.Ticket;
import java.util.List;

public interface TicketDAO {
    public void saveTicket(Ticket ticket);
    public void updateTicket(Ticket ticket);
    public void deleteTicket(Ticket ticket);
    public List<Ticket> findTicket(String name);

}
