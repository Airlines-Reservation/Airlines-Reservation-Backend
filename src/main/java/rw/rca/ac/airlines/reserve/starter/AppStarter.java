package rw.rca.ac.airlines.reserve.starter;

import rw.rca.ac.airlines.reserve.controllers.FlightController;
import rw.rca.ac.airlines.reserve.dao.DAO;
import rw.rca.ac.airlines.reserve.dbsync.DatabaseSync;

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
                fc.createFlight();
                fc.getFlight();
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
        System.out.println("1. Test or Demo the application");
        System.out.println("2. Request ADMIN ");
        System.out.println("Enter the corresponding numeral");
        System.out.println("============================================================================= Provide =============================================");
        Scanner scan = new Scanner(System.in);
        int serviceInput ;
        System.out.print("->: ");
        serviceInput = scan.nextInt();
        serviceChoice(serviceInput);
    }
}