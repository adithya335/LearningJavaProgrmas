package Tasks.July_8th;

import java.util.Scanner;

public class PrimitiveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        // Converting the user input string into primitive data type int
        int usr_num = Integer.parseInt(number);

        System.out.println("String number is: " + number);
        System.out.println("***************************************");
        System.out.println("Primitive usr_num is: " + usr_num);

    }
}
