package rw.rca.ac.airlines.reserve.starter;

import rw.rca.ac.airlines.reserve.controllers.FlightController;
import rw.rca.ac.airlines.reserve.dao.DAO;
import rw.rca.ac.airlines.reserve.dbsync.DatabaseSync;
import rw.rca.ac.airlines.reserve.orm.Flight;

import java.util.List;
import java.util.Scanner;

public class AppStarter
{
    public static int serviceChoice(int n) {
        int serviceNo = 0;
        switch (n)
        {
            case 1: n=1;
                serviceNo = 1;
                System.out.println("Loading Signin page .......");
                FlightController fc = new FlightController();
//                fc.createFlight();
                List<Flight> allFlights = fc.getFlight();
                for(Flight fl : allFlights){
                    System.out.println("Flight -->"+fl.getCode());
                }
            case 2: n=2;
                serviceNo = 2;
                System.out.println("Feature coming soon........");
        }
        return serviceNo;
    }
    public static void main(String[] args) {
        System.out.println( 
           "∭∭∭∭∭∭\\  ∭∭\\           ∭∭\\ ∭∭\\\n"
        + "∭∭  __∭∭\\ \\__|          ∭∭ |\\__|\n"
        + "∭∭ /  ∭∭ |∭∭\\  ∭∭∭∭∭∭\\  ∭∭ |∭∭\\ ∭∭∭∭∭∭∭\\   ∭∭∭∭∭∭\\   ∭∭∭∭∭∭∭\\\n"
        + "∭∭∭∭∭∭∭∭ |∭∭ |∭∭  __∭∭\\ ∭∭ |∭∭ |∭∭  __∭∭\\ ∭∭  __∭∭\\ ∭∭  _____|\n"
        + "∭∭  __∭∭ |∭∭ |∭∭ |  \\__|∭∭ |∭∭ |∭∭ |  ∭∭ |∭∭∭∭∭∭∭∭ |\\∭∭∭∭∭∭\\\n"
        + "∭∭ |  ∭∭ |∭∭ |∭∭ |      ∭∭ |∭∭ |∭∭ |  ∭∭ |∭∭   ____| \\____∭∭\\\n"
        + "∭∭ |  ∭∭ |∭∭ |∭∭ |      ∭∭ |∭∭ |∭∭ |  ∭∭ |\\∭∭∭∭∭∭∭\\ ∭∭∭∭∭∭∭  |\n"
        + "\\__|  \\__|\\__|\\__|      \\__|\\__|\\__|  \\__| \\_______|\\_______/\n"
        + "\n"
        + "∭∭∭∭∭∭∭\\\n"
        + "∭∭  __∭∭\\\n"
        + "∭∭ |  ∭∭ | ∭∭∭∭∭∭\\   ∭∭∭∭∭∭∭\\  ∭∭∭∭∭∭\\   ∭∭∭∭∭∭\\ ∭∭\\    ∭∭\\  ∭∭∭∭∭∭\\\n"
        + "∭∭∭∭∭∭∭  |∭∭  __∭∭\\ ∭∭  _____|∭∭  __∭∭\\ ∭∭  __∭∭\\\\∭∭\\  ∭∭  |∭∭  __∭∭\\\n"
        + "∭∭  __∭∭< ∭∭∭∭∭∭∭∭ |\\∭∭∭∭∭∭\\  ∭∭∭∭∭∭∭∭ |∭∭ |  \\__|\\∭∭\\∭∭  / ∭∭∭∭∭∭∭∭ |\n"
        + "∭∭ |  ∭∭ |∭∭   ____| \\____∭∭\\ ∭∭   ____|∭∭ |       \\∭∭∭  /  ∭∭   ____|\n"
        + "∭∭ |  ∭∭ |\\∭∭∭∭∭∭∭\\ ∭∭∭∭∭∭∭  |\\∭∭∭∭∭∭∭\\ ∭∭ |        \\∭  /   \\∭∭∭∭∭∭∭\\\n"
        + "\\__|  \\__| \\_______|\\_______/  \\_______|\\__|         \\_/     \\_______|\n"
        );
        System.out.println("Welcome to the Airlines Reservation Application");
        System.out.println("1. Sign up");
        System.out.println("2. Sign in ");
        System.out.println("Enter the corresponding numeral");
        System.out.println("============================================================================= Provide =============================================");
        Scanner scan = new Scanner(System.in);
        int serviceInput ;
        System.out.print("->: ");
        serviceInput = scan.nextInt();
        serviceChoice(serviceInput);
    }
}