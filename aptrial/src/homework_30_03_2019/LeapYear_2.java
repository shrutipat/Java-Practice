package homework_30_03_2019;

import java.util.Scanner;

public class LeapYear_2 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        if (isLeapYear(year)==true){
            System.out.println(year + " is Leap Year");
        }
        else{
            System.out.println(year + " is not Leap Year");
        }

    }

    public static boolean isLeapYear(int year) {

       if (year > 1 || year < 9999) {
            if (year % 400 == 0) {
                return true;   // multiple of 400 = leap year
            } else if (year % 100 == 0 && year % 400 != 0) {
                return false;   // multiple of 100 but not multiple of 400 = not leap year
            } else if (year % 4 == 0 && year % 100 != 0) {
                return true;   // multiple of 4 but not multiple of 100 = leap year
            } else {
                return false;  //not multiple of 4, 100 or 400 = not leap year
            }
        }
        else{
            return false; }

    }

}
