package homework_23_03_2019;

import java.util.Scanner;

public class UpperToLowerCase {

    public static void main(String[] args){

        String str_L, str_U;
        System.out.println();
        System.out.println("Enter your string here: ");

        Scanner sc= new Scanner(System.in);
        str_L = sc.nextLine();
        str_U=str_L.toUpperCase();
        System.out.println(str_U);
    }
}
