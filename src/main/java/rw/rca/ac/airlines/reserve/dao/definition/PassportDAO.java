package rw.rca.ac.airlines.reserve.dao.definition;

import java.util.List;

import rw.rca.ac.airlines.reserve.orm.Passport;

public interface PassportDAO {
    public void savePassport(Passport passport);
    public void updatePassport(Passport passport);
    public void deletePassport(Passport passport);
    public List<Passport> findPassport(String name);
}
