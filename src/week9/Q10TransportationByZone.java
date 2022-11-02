package week9;

import java.util.Scanner;

public class Q10TransportationByZone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Oxford Circus\n2) Leicester Square\n3) GreenPark");
        System.out.println("------------------");
        System.out.println("Please select any station name to know which line is passing through : ");
        String station = sc.nextLine();

        Q10TransportationByZone obj = new Q10TransportationByZone();
        obj.stationName(station);
        sc.close();
    }

    public void stationName(String transportation ) {
        switch (transportation) {
            case "1":
                System.out.println("Bakerloo , Victoria , Central");
                break;
            case "2":
                System.out.println("Northern,Piccadilly ");
                break;
            case "3":
                System.out.println("Jubilee, Victoria , Piccadilly");
                break;

            default:
                System.out.println("Please enter correct train name:");
        }
    }
}