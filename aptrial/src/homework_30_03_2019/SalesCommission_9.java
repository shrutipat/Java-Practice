package homework_30_03_2019;

import java.util.Scanner;

public class SalesCommission_9 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter Seller Name\t: ");
            String name = scanner.next();

            System.out.print("Enter Seller id\t\t: ");
            int id = scanner.nextInt();

            System.out.print("Enter Sales Amount\t: ");
            int sales = scanner.nextInt();

            System.out.print("Enter Salary\t\t: ");
            int salary = scanner.nextInt();

            double salesC = 0;

            if (sales >= 50000) {
                salesC = (sales * 35 / 100);

            } else if (sales >= 30000) {
                salesC = (sales * 20 / 100);

            } else if (sales >= 20000) {
                salesC = (sales * 10 / 100);

            } else if (sales >= 10000) {
                salesC = (sales * 5 / 100);

            } else if (sales <= 10000) {
                salesC = (sales * 2 / 100);
            }

            double total = salary + salesC;


            System.out.println("========================================================");
            System.out.println("\t\t\t\t Salary Slip");
            System.out.println("========================================================");
            System.out.println("\tEmployee Name\t\t:\t" + name);
            System.out.println("\tEmployee ID\t\t\t:\t" + id);
            System.out.println("========================================================");
            System.out.println("\tBasic Salary\t\t:\t" + salary);
            System.out.println("\tSales Commission\t:\t" + salesC);
            System.out.println("\tTotal\t\t\t\t:\t" + total);
            System.out.println("========================================================");

        }
}
