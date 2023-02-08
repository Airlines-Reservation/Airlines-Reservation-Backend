package rw.rca.ac.airlines.reserve.orm;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "passenger")
public class Passenger extends Person {
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Passport.class)
    @JoinTable(name = "passport_passenger", joinColumns = { @JoinColumn(name = "passport_id") }, inverseJoinColumns = {
            @JoinColumn(name = "passenger_id") })
    private List<Passport> passportIds;


    public List<Passport> getPassportIds() {
        return passportIds;
    }

    public void setPassportIds(List<Passport> passportIds) {
        this.passportIds = passportIds;
    }

    public Passenger() {
        super();
    }

    public Passenger(String firstName, String lastName, String nationality, Date dob) {
        super(firstName, lastName, nationality, dob);
    }
}
