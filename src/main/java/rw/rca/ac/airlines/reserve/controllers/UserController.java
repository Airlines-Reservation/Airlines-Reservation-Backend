package rw.rca.ac.airlines.reserve.controllers;

import rw.rca.ac.airlines.reserve.dao.DAO;
import rw.rca.ac.airlines.reserve.dao.definition.UserDAO;
import rw.rca.ac.airlines.reserve.dao.implementation.UserDAOImplementation;
import rw.rca.ac.airlines.reserve.orm.User;

import java.util.Date;
import java.util.Scanner;

public class UserController {
    Scanner sc = new Scanner(System.in);
    UserDAOImplementation user;
    public User authenticate() {

        System.out.print("email: ");
        String email = sc.nextLine();

        System.out.print("password: ");
        String password = sc.nextLine();

        User usr = user.authenticate(email, password);
        return usr;
    }

    public void register () {
        System.out.print("firstName: ");
        String firstName = sc.nextLine();
        System.out.print("lastName: ");
        String lastName = sc.nextLine();
        System.out.print("nationality: ");
        String nationality = sc.nextLine();
        System.out.print("dob: ");
        String dob = sc.nextLine();
        System.out.print("email: ");
        String email = sc.nextLine();
        System.out.print("password: ");
        String password = sc.nextLine();

        User usr = new User(firstName, lastName, nationality, new Date(dob), email,password);

        user.registerUser(usr);

    }

}
