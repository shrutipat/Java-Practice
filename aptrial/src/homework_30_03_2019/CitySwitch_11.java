package homework_30_03_2019;

import java.util.Scanner;

public class CitySwitch_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter City initial : ");
        String city = scanner.next();
        city = city.toLowerCase();
        switch (city) {
            case "a":
                System.out.println("City name is Ahmedabad");
                break;
            case "b":
                System.out.println("City name is Bombay");
                break;
            case "c":
                System.out.println("City name is Calcutta");
                break;
            case "d":
                System.out.println("City name is Delhi");
                break;
            case "e":
                System.out.println("City name is Edinbourgh");
                break;
            case "f":
                System.out.println("City name is France");
                break;
            default:
                System.out.println("Enter letter between a to f only");
        }
    }
}