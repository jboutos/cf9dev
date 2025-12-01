package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class Division2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double result = 0D;
        double remaining = 0.0;

        System.out.println("Please enter two doubles");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        result = num1 / num2;
        remaining = num1 % num2;

        System.out.printf("%.2f / %.2f = %05.2f%n", num1, num2, result);
        System.out.printf("%.2f %% %.2f = %5.2f%n", num1, num2, remaining);
    }
}
