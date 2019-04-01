package homework_30_03_2019;

import java.util.Scanner;

public class EvenOdd_1 {

           public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter Your Number: ");

            int num;
            num = scan.nextInt();

            String evenodd = (num % 2 == 0) ? "even number." : "odd number.";

            //System.out.println(evenodd + " = " + num);
            System.out.println( num + " is " + evenodd);
        }
    }



