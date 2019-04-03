package homework_30_03_2019;

import java.util.Scanner;

public class MarkSheet_3 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" \nEnter Student Name\t: " );
        String name = scanner.next();
        System.out.print("Enter Student RollNo: " );
        int rollNo = scanner.nextInt();
        System.out.print("Enter Maths Marks\t: " );
        int maths = scanner.nextInt();
        System.out.print("Enter English Marks\t: " );
        int english = scanner. nextInt();
        System.out.print("Enter Science Marks\t: " );
        int science = scanner.nextInt();
        int total = maths+science+english;
        int percentage= total/3;

        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t\t\t\t MarkSheet"+"\t\t\t\t\t|");
        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t Name \t\t\t:\t\t"+ name+"\t\t\t|");
        System.out.print("\n|\t RollNo\t\t\t:\t\t" + rollNo+"\t\t\t|" );
        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t Subjects\t\t:  \t\tMarks\t\t\t|");
        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t Maths\t\t\t: \t\t " +maths+"\t\t\t\t|");
        System.out.print("\n|\t English\t\t: \t\t " +english+"\t\t\t\t|");
        System.out.print("\n|\t Science\t\t: \t\t " +science+"\t\t\t\t|");
        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t Total\t\t\t: \t\t"+ total+"\t\t\t\t|");
        System.out.print("\n|\t Percentage\t\t: \t\t" +percentage+"%\t\t\t\t|");


        if (percentage>=35)

        {
            System.out.print("\n|\t pass/fail\t\t:  \t\tPass\t\t\t|");
        }
        else
        {
            System.out.print("\n|\t pass/fail\t\t:  \t\tFail\t\t\t|");

        }
        if (percentage>= 80)
        {
            System.out.print("\n|\t Grade\t\t\t:  \t\tA+\t\t\t\t|");
        } else if (percentage >= 60)
        {
            System.out.print("\n|\t Grade\t\t\t:  \t\tA\t\t\t\t|");

        }else if(percentage>=50)
        {
            System.out.print("\n|\t Grade\t\t\t:  \t\tB\t\t\t\t|");

        }else if (percentage>=35)
        {
            System.out.print("\n|\t Grade\t\t\t:  \t\tC\t\t\t\t|");
        }
        System.out.print("\n|-------------------------------------------|");

    }

}
