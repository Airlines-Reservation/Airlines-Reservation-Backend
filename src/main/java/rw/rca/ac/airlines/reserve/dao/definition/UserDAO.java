package rw.rca.ac.airlines.reserve.dao.definition;

import rw.rca.ac.airlines.reserve.orm.User;

import java.util.List;

public interface UserDAO {
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public List<User> findUser(String name);

    public User authenticate(String email, String password);
    public void registerUser(User user);
}
