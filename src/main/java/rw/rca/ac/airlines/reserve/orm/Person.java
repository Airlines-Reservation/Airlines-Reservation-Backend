package rw.rca.ac.airlines.reserve.orm;

import java.util.Date;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String nationality;
    private Date dob;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public Person(String firstName, String lastName, String nationality, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.dob = dob;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

<<<<<<< HEAD
    
}
=======
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
>>>>>>> 6a07fef93009c11d5655ca2b35e74cfbc60d9a57
