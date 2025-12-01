package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 NumberFormatException is thrown when * we parse a non-numeric token with * wrapper classes,
 such as Integer.parseInt("xxx")
 */
public class NumberFormatExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        System.out.println("Please enter a number: ");
        //inputStr = scanner.nextLine();
        while (!isInteger(inputStr = scanner.nextLine())) {
                System.out.println("Not acceptable character. Please enter a new integer");
            }

        num = Integer.parseInt(inputStr);
        System.out.println("The number is: " + num);
    }

    //checks if the string is an integer
    public static boolean isInteger(String s) {
        return s.matches("-?[0-9]+"); //check if s matches the pattern (starts with - or not/is it a number between
        //1 or 9 one or more times?
    }
}
