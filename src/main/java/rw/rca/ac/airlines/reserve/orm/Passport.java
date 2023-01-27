package rw.rca.ac.airlines.reserve.orm;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //    @Column(name = "id", nullable = false)
    private ArrayList<String> accessCountries;
    private String nationality;

    public boolean isValidFlight() {
        return isValidFlight;
    }

    public void setValidFlight(boolean validFlight) {
        isValidFlight = validFlight;
    }

    private boolean isValidFlight;
    private Date expirationDate;
    private Date issueDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passport(boolean isValidFlight, Date expirationDate, Date issueDate,
            ArrayList<String> accessCountries, String nationality) {
        this.isValidFlight = isValidFlight;
        this.expirationDate = expirationDate;
        this.issueDate = issueDate;
        // this.owner = owner;
        this.accessCountries = accessCountries;
        this.nationality = nationality;
    }

    public boolean isValid() {
        return isValidFlight;
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
