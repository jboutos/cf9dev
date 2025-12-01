package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the absolute of an integer, τριαδικός τελεστής
 */

public class TernaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int abs = 0;

        System.out.println("Please enter a number: ");
        num1 = scanner.nextInt();

        //If (?) the number is greater than zero then abs = num else (:) abs = -num
        abs = (num1 >= 0) ? num1 : -num1;

        System.out.printf("Abs of %d is %d%n", num1, abs);
    }
}
