package homework_30_03_2019;

import java.util.Scanner;

public class MarkSheet_3 {
    /**
     * This programme is not working as expected for 35 marks
     * Enter 35 marks for all three subject
     * Expected Result: pass and Grade is C
     * Actual Result : fail and C.
     * If student fail in one subject result should be fail. But for your programme gives A Grade and pass result
     */



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Student Name\t  : " );
        String name = scanner.next();
        System.out.print(" Enter Student Rollno\t: " );
        int rollno = scanner.nextInt();
        System.out.print(" Enter Maths Marks\t   : " );
        int maths = scanner.nextInt();
        System.out.print("Enter English Marks\t  :" );
        int english = scanner. nextInt();
        System.out.print("Enter Science Marks\t  : " );
        int science = scanner.nextInt();
        int total = maths+science+english;
        int percentage= total/3;

        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t\t\t\t Marksheet"+"\t\t\t\t\t|");
        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t Name \t\t\t:\t\t"+ name+"\t\t\t|");
        System.out.print("\n|\t Rollno\t\t\t:\t\t" + rollno+"\t\t\t|" );
        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t Subjects\t\t:  \t\tMarks\t\t\t|");
        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t Maths\t\t\t: \t\t " +maths+"\t\t\t\t|");
        System.out.print("\n|\t English\t\t: \t\t " +english+"\t\t\t\t|");
        System.out.print("\n|\t Science\t\t: \t\t " +science+"\t\t\t\t|");
        System.out.print("\n|-------------------------------------------|");
        System.out.print("\n|\t Total\t\t\t: \t\t"+ total+"\t\t\t\t|");
        System.out.print("\n|\t Percentage\t\t: \t\t" +percentage+"%\t\t\t\t|");


        if (percentage>35)

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
