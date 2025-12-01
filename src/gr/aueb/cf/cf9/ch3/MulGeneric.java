package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class MulGeneric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        long result = 1L;
        int n = 0;

        System.out.println("Please enter number of repetitions: ");
        n = scanner.nextInt();

        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.printf("The result of the multiplication is: %d%n", result);
    }
}
