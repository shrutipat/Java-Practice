package homework_23_03_2019;

import java.util.Scanner;

public class AreaOfCircle {

    static final float pi = 3.14f;

    public static void main(String[] args) {

        AreaOfCircle aoc = new AreaOfCircle();
        System.out.println();
        System.out.println("Your Circle Area is : "+aoc.area());

    }

    float area(){

        float r;
        float area;
        Scanner scr = new Scanner(System.in);
        System.out.print("Please enter value of Radius : ");
        r = scr.nextFloat();
        area = AreaOfCircle.pi*r*r;
        return(area);
    }

}