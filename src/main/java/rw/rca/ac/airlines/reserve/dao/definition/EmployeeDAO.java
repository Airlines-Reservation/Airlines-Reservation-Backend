package rw.rca.ac.airlines.reserve.dao.definition;

import rw.rca.ac.airlines.reserve.enums.EmployeeStatus;
import rw.rca.ac.airlines.reserve.orm.Employee;
import rw.rca.ac.airlines.reserve.orm.Pilot;

import java.util.List;

public interface EmployeeDAO
{
    public void saveEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public List<Employee> findEmployee(Employee employee);
}
