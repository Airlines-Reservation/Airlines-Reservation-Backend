package rw.rca.ac.airlines.reserve.dao;

import org.hibernate.*;

import rw.rca.ac.airlines.reserve.util.ARSessionFactory;

import java.util.List;

public class DAO<T> {
    private Class<T> type;
    private SessionFactory sessionFactory = ARSessionFactory.getSession().getSessionFactory();

    public DAO(Class<T> type) {
        this.type = type;
    }


    public void create(T t){
        Session session = ARSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(t);
        transaction.commit();
    }

    public T get(int id) {
        Session session = sessionFactory.openSession();
        T t = (T) session.get(DAO.class , id);
        session.close();
        return t;
    }

    public List<T> getAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from " + type.getSimpleName());
        List<T> list = query.list();
        session.close();
        return list;
    }
    public void update(T t) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(t);
        transaction.commit();
        session.close();
    }

    public void delete(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        T t = (T) session.get(DAO.class,id);
        session.delete(t);
        transaction.commit();
        session.close();
    }
}
