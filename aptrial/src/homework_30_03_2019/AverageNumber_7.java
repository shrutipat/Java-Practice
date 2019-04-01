package homework_30_03_2019;

import java.util.Scanner;

    public class AverageNumber_7 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i, n=0 , s=0;
            double  avg;

            System.out.println("Enter 5 Numbers : ");

            for (i=0; i<5; i++) {

                n = scan.nextInt();
                s += n;
            }

            avg = s/5;
            System.out.println("The Sum of 5 no is : " +s+"\nThe Average is : " +avg);

        }
    }


