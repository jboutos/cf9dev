package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Arithmetic exception is created {}@link ArithmeticException} without handling it (in comments)
 */
public class ArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        //System.out.println("Please enter two ints");
        //num1 = scanner.nextInt();
        //num2 = scanner.nextInt();

        //result = num1 / num2; //if num2 = 0 throws arithmetic exception

        //System.out.println("result" + result); //unreachable


            System.out.println("Please enter 2 numbers: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        try {
            result = num1 / num2;

            System.out.println();
        } catch (java.lang.ArithmeticException e) {
            e.printStackTrace(); // prints stack trace
            System.err.println(e.getMessage()); // / by zero will be the message
        }

        System.out.println("Result" + result); //this line will be executed
    }

    public static int div(int num1, int num2) {
        return num1 / num2; //different stacktrace
    }
}
