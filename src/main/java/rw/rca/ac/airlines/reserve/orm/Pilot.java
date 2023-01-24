package rw.rca.ac.airlines.reserve.orm;

import java.util.Date;

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
