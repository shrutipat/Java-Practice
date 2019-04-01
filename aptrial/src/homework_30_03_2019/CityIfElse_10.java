package homework_30_03_2019;

import java.util.Scanner;

public class CityIfElse_10 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter first letter of City between a to f : ");

            char cityName;

            cityName = scan.next().charAt(0);

            if (cityName == 'a' || cityName == 'A') {

                System.out.println("Atlanta");
            }
            else if(cityName == 'b' || cityName == 'B') {

                System.out.println("Bombay");
            }
            else if (cityName == 'c' || cityName == 'C') {

                System.out.println("Chennai");
            }
            else if (cityName == 'd' || cityName == 'D') {

                System.out.println("Delhi");
            }

            else if (cityName == 'e' || cityName=='E') {

                System.out.println("Elora");
            }

            else if (cityName == 'f' || cityName == 'F') {

                System.out.println("France");
            }

            else if (cityName == 'g' || cityName == 'G') {

                System.out.println("Goa");
            }
            else
            {
                System.out.println("Enter letter a to f only");
            }

        }
    }

