package rw.rca.ac.airlines.reserve.orm;

public class User {
    private int id;
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", telephone=" + telephone + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public User(String name, String email, int telephone) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    private int telephone;
}
