package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please enter a number and the power it will be raised to: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result = result * base;
            i++;
        }

        System.out.printf("%d to the power of %d is equal to %d%n", base, power, result);
    }
}
