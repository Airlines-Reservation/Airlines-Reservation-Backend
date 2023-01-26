package rw.rca.ac.airlines.reserve.starter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rw.rca.ac.airlines.reserve.orm.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppStarter {
    public static void main(String[] args) {
        ArrayList<String> accessableCountries = new ArrayList<String>();
        accessableCountries.add("Kigali");
        accessableCountries.add("Bujumbura");
        Passport passport = new Passport(false,new Date(12,1,2000),new Date(12,02,1998),accessableCountries,"Rwandan");
        Flight flight = new Flight(123,"Kigali","Angola",new Date(12,02,2022),false,200,29149.50);
        Pilot pilot = new Pilot("Iris","Ngabo","Rwandan",new Date(12,04,2008),2120);
        Seat seat = new Seat(1239923);
        Category category = new Category("Business Class",8023.30,"Premium customer care");
        Passenger passenger = new Passenger("Manzi","Cedrick","Rwandan",new Date(12,02,2000),1);
        Ticket ticket = new Ticket(123123,new Date(12,8,2000),new Date(12,3,2021));


        System.out.println("Loading the configurations");

        try{
            Configuration config = new Configuration();
            System.out.println("Session Factory calling..........");
            config.configure("hibernate.cfg.xml");
            SessionFactory factory = config.buildSessionFactory();
            Session session = factory.openSession();
            System.out.println("Beginning Transactions ..........");
            Transaction transaction = session.beginTransaction();

            session.saveOrUpdate(passport);
            session.saveOrUpdate(flight);
            session.saveOrUpdate(pilot);
            session.saveOrUpdate(seat);
            session.saveOrUpdate(category);
            session.saveOrUpdate(passenger);
            session.saveOrUpdate(ticket);

            System.out.println("Committing the transactions..............");
            transaction.commit();
            System.out.println("Closing the files");
            factory.close();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
