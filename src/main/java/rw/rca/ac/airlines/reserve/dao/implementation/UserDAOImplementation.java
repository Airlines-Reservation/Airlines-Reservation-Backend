package rw.rca.ac.airlines.reserve.dao.implementation;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rw.rca.ac.airlines.reserve.dao.DAO;
import rw.rca.ac.airlines.reserve.dao.definition.UserDAO;
import rw.rca.ac.airlines.reserve.orm.User;
import rw.rca.ac.airlines.reserve.util.ARSessionFactory;

import java.util.List;

public class UserDAOImplementation implements UserDAO {
    private SessionFactory sessionFactory = ARSessionFactory.getSession().getSessionFactory();
    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<User> findUser(String name) {
        return null;
    }

    @Override
    public User authenticate(String username, String password) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from User u where u.username = :username and u.password = :password");
        query.setParameter("username", username);
        query.setParameter("password", password);
        User user = (User) query.uniqueResult();
        session.close();
        return user;
    }

    @Override
    public void registerUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
    }


}
