package homework_30_03_2019;

import java.util.Scanner;

public class DaysInMonth_4 {

    public static void main(String[] args) {

        int month, year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Month : ");
        month = sc.nextInt();

        System.out.println("Enter Year : ");
        year = sc.nextInt();

        System.out.println("Number of Days are : "+getDaysInMonth(month,year));
    }





   public static boolean isLeapYear(int year) {

       boolean checkY;

       if (year > 1 || year < 9999) {
           if (year % 400 == 0) {
               checkY = true;   // multiple of 400 = leap year
           } else if (year % 100 == 0 && year % 400 != 0) {
               checkY = false;   // multiple of 100 but not multiple of 400 = not leap year
           } else if (year % 4 == 0 && year % 100 != 0) {
               checkY = true;   // multiple of 4 but not multiple of 100 = leap year
           } else {
               checkY = false;  //not multiple of 4, 100 or 400 = not leap year
           }
           return checkY;
       }
       else{
            return false; }

   }

   public static int getDaysInMonth (int month, int year){

        if (year<1 || year>9999){
            return -1;  //out of range year
        }

        if (month<1 || month >12){
            return -1;  // out of range month
        }

        else if(month==4||month==6||month==9||month==11) {
                return 30;
            }
        else if (month == 2) {
            if (isLeapYear(year) == true) {
                return 29;  // leap year so feb has 29 days
            }
            else {
                return 28;  // not leap year
            }
        }
        else
        {
                 return 31;
        }

   }

}
