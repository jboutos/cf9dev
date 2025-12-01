package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;
        double remaining = 0.0;

        System.out.println("Please enter two doubles");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        result = num1 / num2;
        remaining = num1 % num2;

        //η διαίρεση δεκαδικών είναι δεκαδικός
        //η διαίρεση με το 0 δεν είναι λάθος, δίνει infinity
        //το υπόλοιπο της διαίρεσης είναι το υπόλοιπο της διαίρεσης με το ακέραιο μέρος!!! δηλαδή
        //αν ναμ 1 10.4 και ναμ 2 3.3 ναμ1 % ναμ2 10.4 % 3
        System.out.printf("Div = %5.2f%n", result);
        System.out.printf("Mod = %5.2f", remaining);
    }
}
