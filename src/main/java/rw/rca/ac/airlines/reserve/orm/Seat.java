package rw.rca.ac.airlines.reserve.orm;

public class Seat {
    private int id;
    private int code;
    private Category category;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Seat(int code, Category category) {
        this.code = code;
        this.category = category;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    
}
