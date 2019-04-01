package homework_30_03_2019;

import java.util.Scanner;

public class NumberAlphabetSymbol_14 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Input here: ");
        char x=scan.next().charAt(0);


        if (x>=48 && x<=57) {

            System.out.println(" It is Number.");
        }

        else if( x>='a' && x<='z') {

            System.out.println("It is Alphabet.");
        }

        else{
            System.out.println("It is Symbol");

        }
    }
}


