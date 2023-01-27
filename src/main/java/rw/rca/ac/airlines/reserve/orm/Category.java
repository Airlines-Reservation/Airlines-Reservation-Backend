package rw.rca.ac.airlines.reserve.orm;

import javax.persistence.*;

@Entity
@Table(name = "categori")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double price;
    private String services;

    public int getId() {
        return id;
    }

    public Category(String name, double price, String services) {
        this.name = name;
        this.price = price;
        this.services = services;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

}
