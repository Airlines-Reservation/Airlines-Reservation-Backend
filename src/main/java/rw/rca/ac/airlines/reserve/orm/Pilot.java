package rw.rca.ac.airlines.reserve.orm;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pilot")
public class Pilot extends Person {
    private int pilotCode;

    public int getPilotCode() {
        return pilotCode;
    }

    public Pilot(String firstName, String lastName, String nationality, Date dob, int pilotCode) {
        super(firstName, lastName, nationality, dob);
        this.pilotCode = pilotCode;
    }

    public void setPilotCode(int pilotCode) {
        this.pilotCode = pilotCode;
    }
}
