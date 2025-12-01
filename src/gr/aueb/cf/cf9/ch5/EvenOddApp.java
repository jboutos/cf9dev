package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class EvenOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter an integer: ");
        num = scanner.nextInt();

        //System.out.printf("%d is %s", num, isEven(num) ? "even" : "odd");
        System.out.printf("%d is even: %b", num, isEven(num));
    }

    public static boolean isEven(int num) {
        return (num % 2) == 0;
    }

    //μέσα σε μία μέθοδο καλούμε μία άλλη μέθοδο
    public static boolean isOdd(int num) {
        return !isEven(num);
        //return (num % 2) != 0;
    }
}
