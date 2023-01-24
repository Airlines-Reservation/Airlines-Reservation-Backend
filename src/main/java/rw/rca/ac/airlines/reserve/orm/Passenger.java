package rw.rca.ac.airlines.reserve.orm;

public class Passenger extends Person{
    private int passportId;

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public Passenger(int passportId) {
        this.passportId = passportId;
    }
}
