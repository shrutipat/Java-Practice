package homework_30_03_2019;

import java.util.Scanner;

public class WeekNames_15 {
    public static void main(String[] args) {

        int day;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number between 1 and 7 : ");

        day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("1st Day of week is Monday");
                    break;
            case 2:
                System.out.println("2nd Day of week is Tuesday");
                    break;
            case 3:
                System.out.println("3rd Day of week is Wednesday");
                break;
            case 4:
                System.out.println("4th Day of week is Thursday");
                break;
            case 5:
                System.out.println("5th Day of week is Friday");
                break;
            case 6:
                System.out.println("6th Day of week is Saturday");
                break;
            case 7:
                System.out.println("7th Day of week is Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days only");
                break;
        }

    }
}
