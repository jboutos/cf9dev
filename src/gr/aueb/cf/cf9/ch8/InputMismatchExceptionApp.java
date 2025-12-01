package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * The {@link InputMismatchException} happens
 * when the scanner fails to read the right type of data.
 */
public class InputMismatchExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert an int");
        //inputNum = scanner.nextInt();

        //System.out.println("Num: " + inputNum);

        while (!scanner.hasNextInt()) { //hasnextint checks if the next token is int
            System.out.println("Not acceptable characters. Please enter an integer");
            scanner.nextLine(); //we consume the inappropriate string (there's a string in scanner nextInt)
        }

        inputNum = scanner.nextInt();
        System.out.println("Input number: " + inputNum);
    }
}
