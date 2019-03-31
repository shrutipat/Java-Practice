package homework_30_03_2019;

//        Write a program for a calculator with addition, subtraction, multiplication and division methods all with parameters and use string concatenation methods.
//        2 methods should be static and 2 methods are instance.

import java.util.Scanner;

public class CalculatorOperators_12 {

    public static void main (String[] args){

        System.out.println();
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to mini calculator");
        System.out.println("Enter first number: ");
        float n1 = input.nextFloat();
        System.out.print("Enter any Arithmetic Operator (+ - x /) : ");
        String str=input.next();
        System.out.print("Enter Second number: ");
        float n2 = input.nextFloat();
        float ans;

        CalculatorOperators_12 COP = new CalculatorOperators_12();

        if (str.contains("+")){
            add(n1,n2);
        }

        else if (str.contains("-")){
            sub(n1,n2);
        }
        else if(str.contains("x")||str.contains("X")) {

            COP.multiple(n1,n2);
        }
        else if (str.contains("/")){
            COP.division(n1,n2);
        }
        else{

            //exception handling for wrong operator input

            System.out.println();
            System.out.println("Oooops!! You entered wrong operator");
        }

    }
    static void add(float n1,float n2){
        float ans=n1+n2;
        System.out.println();
        System.out.println(n1+" + "+n2+" = "+ans);
        System.out.println();
    }

    static void sub(float n1,float n2){
        float ans=n1+n2;
        System.out.println();
        System.out.println(n1+" - "+n2+" = "+ans);
        System.out.println();

    }

    void multiple(float n1, float n2){
        float ans=n1*n2;
        System.out.println();
        System.out.println(n1+" X "+n2+" = "+ans);
        System.out.println();
    }

    void division(float n1, float n2){
        float ans=n1/n2;
        System.out.println();
        System.out.println(n1+" / "+n2+" = "+ans);
        System.out.println();
    }
}
