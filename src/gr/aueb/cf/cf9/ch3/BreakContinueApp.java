package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class BreakContinueApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Please provide a number: ");
            num = scanner.nextInt();

            //if the number is 5 ignore it
            //and immediately continue to the next loop.

            if (num == 5) {
                continue;
            }
            sum += num;

            //if the number is equal to 10
            //stop immediately the loop
            //and get out of while.

            if (num == 10) {
                break;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
