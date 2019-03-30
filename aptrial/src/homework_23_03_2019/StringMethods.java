package homework_23_03_2019;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Hello! ";
        String str2 = "Archita Patel";
        String str3 = " is the best!";
        String copy = "Hello! ";

        System.out.println();
        System.out.println();
        System.out.println("String length is : " + str.length());
        System.out.println("Character at 0 Location is : " + str.charAt(0));
        System.out.println(str.concat(str2.concat(str3)));

        boolean check;
        check = str2.contains("a");
        System.out.println("Does 'Archita Patel' contain letter a? Ans: " + check);

        boolean check2;
        check2 = str.startsWith("Arc");
        System.out.println("Does 'Hello! ' start with Arc? Ans: " + check2);

        boolean check3;
        check3 = str.endsWith("abc");
        System.out.println("Does 'Hello! ' end with abc?" + check3);

        System.out.println("Does 'Hello! ' equals 'Hello! '? " + str.equals("Hello! "));
        System.out.println("Index of o in 'Hello! ' is : " + str.indexOf("o"));

        String x = "";
        System.out.println("Is x empty? Ans: " + x.isEmpty());
        System.out.println("Replace 'H' in Hello! with '0' :" + str.replace('H', '0'));
        System.out.println("SubString: " + str2.substring(0, 7));
        System.out.println(str3.toCharArray());
        System.out.println("Lower Case: " + str.toLowerCase());
        System.out.println("Upper Case: " + str.toUpperCase());

        String trimstr = "  Archita Patel  ";
        System.out.println("Trimmed Print : " + str.trim());

    }
}