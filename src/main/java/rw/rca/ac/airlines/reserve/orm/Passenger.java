package rw.rca.ac.airlines.reserve.orm;

import java.util.Date;

public class Passenger extends Person{
    private int passportId;

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public Passenger(String firstName, String lastName, String nationality, Date dob, int passportId) {
        super(firstName, lastName, nationality, dob);
        this.passportId = passportId;
    }
}
