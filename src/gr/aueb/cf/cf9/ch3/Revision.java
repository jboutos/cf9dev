package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int num = 0;
        int facto = 1;

        System.out.println("Please enter a number");
        num = scanner.nextInt();

        while (i <= num) {
            facto *= i; //1 * 2 * 3 * 4 * 5...
            i++;
        }

        System.out.printf("The factorial of %d is %d", num, facto );

    }
}
