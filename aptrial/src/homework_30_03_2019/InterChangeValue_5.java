package homework_30_03_2019;

import java.util.Scanner;

public class InterChangeValue_5 {

    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your a: ");
        a=scan.nextInt();
        System.out.println("Enter your b: ");
        b= scan.nextInt();

        System.out.println("Before swapping : a, b = "+a+", "+b);

        //example explaining comment a=5 b-10)
        a=a+b; // for example(a=5+10  a=15)
        b=a-b; //(b= 15-10  b=5)
        a= a-b; //(a= 15-5 a=10)

        System.out.println("After swapping : a, b = "+a+", "+b);

    }

}
