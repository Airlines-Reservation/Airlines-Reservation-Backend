package rw.rca.ac.airlines.reserve.orm;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user")
public class User extends Person{
    private String email;
    private  String password;

    public User(String firstName, String lastName, String nationality, Date dob, String email, String password) {
        super(firstName, lastName, nationality, dob);
        this.email = email;
        this.password = password;
    }

    public User() {
    }
}
