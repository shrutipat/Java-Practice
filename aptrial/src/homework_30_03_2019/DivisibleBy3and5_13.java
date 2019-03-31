package homework_30_03_2019;

//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.

public class DivisibleBy3and5_13 {

    public static void main(String[] args) {

        int number[] = new int[100];

        for (int i = 0; i < 100; i++) {

            number[i] = i + 1;
        }

        System.out.println("Divisible by 3 : ");

        for (int i = 0; i < 100; i++) {

            if (number[i] % 3 == 0) {
                System.out.print(number[i]);
                if (number[i]<99){
                    System.out.print(", ");
                }
            }

        }
        System.out.println();
        System.out.println("Divisible by 5 : ");

        for (int i = 0; i < 100; i++) {

            if (number[i] % 5 == 0) {
                System.out.print(number[i]);
                if (number[i]<99){
                    System.out.print(", ");
                }
            }

        }
    }
}
