package homework_23_03_2019;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Your Triangle Area is : "+area());
    }

    static double area(){
        float length, width, area;
        Scanner scr = new Scanner(System.in);
        System.out.print("Please enter length of triangle : ");
        length = scr.nextFloat();
        System.out.print("Please enter width of triangle : ");
        width = scr.nextFloat();
        area = length*width/2;
        return(area);
    }

}