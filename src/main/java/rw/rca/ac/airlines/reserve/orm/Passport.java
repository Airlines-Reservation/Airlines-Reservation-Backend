package rw.rca.ac.airlines.reserve.orm;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @OneToOne
    @JoinColumn(name = "passenger_id")
    private Passenger owner;
    private ArrayList<String> accessCountries;
    private String nationality;
    private boolean isValid;
    private Date expirationDate;
    private Date issueDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passport(boolean isValid, Date expirationDate, Date issueDate,
            ArrayList<String> accessCountries, String nationality) {
        this.isValid = isValid;
        this.expirationDate = expirationDate;
        this.issueDate = issueDate;
        // this.owner = owner;
        this.accessCountries = accessCountries;
        this.nationality = nationality;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Passenger getOwner() {
        return owner;
    }

    public void setOwner(Passenger owner) {
        this.owner = owner;
    }

    public ArrayList<String> getAccessCountries() {
        return accessCountries;
    }

    public void setAccessCountries(ArrayList<String> accessCountries) {
        this.accessCountries = accessCountries;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
