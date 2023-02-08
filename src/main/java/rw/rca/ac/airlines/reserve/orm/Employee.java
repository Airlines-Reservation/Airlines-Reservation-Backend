package rw.rca.ac.airlines.reserve.orm;

import rw.rca.ac.airlines.reserve.enums.EmployeeDepartment;
import rw.rca.ac.airlines.reserve.enums.EmployeeStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee extends Person
{
    @Enumerated(EnumType.STRING)
    private EmployeeDepartment role;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
    private String EmployeeCode;
    @OneToOne(mappedBy = "pilot")
    private Flight flight;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        if (this.role == EmployeeDepartment.PILOT) {
            this.flight = flight;
        } else {
            System.out.println("Assignment Not Done");
        }
    }
    public Employee(){}
    public Employee(String firstName, String lastName, String nationality, Date dob, EmployeeDepartment role, EmployeeStatus status, String employeeCode) {
        super(firstName, lastName, nationality, dob);
        this.role = role;
        this.status = status;
        EmployeeCode = employeeCode;
    }
}
