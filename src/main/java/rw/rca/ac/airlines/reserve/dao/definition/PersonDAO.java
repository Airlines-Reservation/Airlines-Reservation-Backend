package rw.rca.ac.airlines.reserve.dao.definition;

import rw.rca.ac.airlines.reserve.orm.Person;
import java.util.List;

public interface PersonDAO {
    public void savePerson(Person person);
    public void updatePerson(Person person);
    public void deletePerson(Person person);
    public List<Person> findPerson(String name);
}
