package week9;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10TrasportationByStationNameUsingArrayList {

    public static void main(String[] args) {
        String transportation;

        System.out.println("1) Oxford Circus\n2) Leicester Square\n3) GreenPark");
        System.out.println("------------------");
        System.out.println("Please select any station name to know which line is passing through : ");
        Scanner a = new Scanner(System.in);
        String b = a.next();

        ArrayList<String> line = new ArrayList<>();
        line.add("Bakerloo");
        line.add("Victoria");
        line.add("Central");
        line.add("Northern");
        line.add("Piccadilly");
        line.add("Jubilee");


        switch (b) {
            case "Oxford Circus":
                System.out.println(line.get(0));
                System.out.println(line.get(1));
                System.out.println(line.get(2));
                break;
            case "Leicester Square":
                System.out.println(line.get(3));
                System.out.println(line.get(4));

                break;
            case "GreenPark":
                System.out.println(line.get(5));
                System.out.println(line.get(4));
                System.out.println(line.get(1));
                break;

            default:
                System.out.println("Please enter correct train name:");
        }
    }

}
