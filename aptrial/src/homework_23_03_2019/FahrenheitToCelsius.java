package homework_23_03_2019;

// °F to °C	Deduct 32, then multiply by 5, then divide by 9

import java.util.Scanner;

public class FahrenheitToCelsius {

static float temp_C, temp_F;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter °F temperature : ");
        temp_F = sc.nextFloat();
        temp_C = convert(temp_F);
        System.out.print("It's "+temp_C+" °C");
        System.out.println();
    }


    static float convert(float x) {

        float ans = ((x-32)*5)/9;
        return(ans);
    }
}