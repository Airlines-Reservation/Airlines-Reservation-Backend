package rw.rca.ac.airlines.reserve.dao.implementation;

import rw.rca.ac.airlines.reserve.dao.definition.EmployeeDAO;
import rw.rca.ac.airlines.reserve.orm.Employee;

import java.util.List;

public class EmployeeDAOImplementor implements EmployeeDAO {
    @Override
    public void saveEmployee(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public List<Employee> findEmployee(Employee employee) {
        return null;
    }
}
