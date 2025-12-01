package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Checks if a number is even or not.
 */
public class EvenApp {

    public static void main(String[] args) {
        //Declaration and initialization
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        //Input, validation and data binding
        System.out.println("Please enter a number: ");

        //input mismatch exception
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        //Business logic
        result = isEven(num);

        //Print result
        System.out.println("The number is even: " + result);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
