package homework_30_03_2019;

import java.util.Scanner;

public class SalarySlip_6 {

    public static void main(String[] args) {

        int emp_ID, basic_Salary;
        float gross_Salary;
        float hra, da, ta, pf;
        String emp_Name;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 5 digit Employee ID : ");
        emp_ID = sc.nextInt();

        System.out.println("Enter Employee Name : ");
        emp_Name = sc.next(); // Allow to enter space by using nextLine instead of next()

        System.out.println("Enter Basic Salary : ");
        basic_Salary = sc.nextInt();

        hra =(basic_Salary*10)/100;
        ta = (basic_Salary*8)/100;
        da = (basic_Salary*9)/100;
        pf = (basic_Salary*10)/100;

        gross_Salary = (basic_Salary + hra + ta + da)-pf;

        System.out.println("_________________________________");
        System.out.println("|         Salary Slip           |");
        System.out.println("|_______________________________|");
        System.out.println("| Employee Id	: "+emp_ID+"\t\t|");
        System.out.println("| Employee Name	: "+emp_Name+"\t\t|");
        System.out.println("|_______________________________|");
        System.out.println("| Basic Salary  : "+basic_Salary+"\t\t|");
        System.out.println("| HRA  10%		: "+hra+"\t\t|");
        System.out.println("| TA   8%	    : "+ta+"\t\t|");
        System.out.println("| DA   9%		: "+da+"\t\t|");
        System.out.println("| PF - 20%		: "+pf+"\t\t|");
        System.out.println("|_______________________________|");
        System.out.println("| Gross Salary	: "+gross_Salary+"\t\t|");
        System.out.println("|===============================|");
    }

}
