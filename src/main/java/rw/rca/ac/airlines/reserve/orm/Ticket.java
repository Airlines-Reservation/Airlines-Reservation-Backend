package rw.rca.ac.airlines.reserve.orm;

public class Ticket {
    private int id;
    private String ticketName;

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketHolder() {
        return ticketHolder;
    }

    public void setTicketHolder(String ticketHolder) {
        this.ticketHolder = ticketHolder;
    }

    public int getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(int ticketCode) {
        this.ticketCode = ticketCode;
    }

    public Ticket(String ticketName, String ticketHolder, int ticketCode) {
        this.ticketName = ticketName;
        this.ticketHolder = ticketHolder;
        this.ticketCode = ticketCode;
    }

    private String ticketHolder;
    private int ticketCode;
}
