package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SentinelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a number (-1 to quit): ");
        num = scanner.nextInt();

        while (num != -1) {
            iterations++;
            System.out.println("Please provide a num: ");
            num = scanner.nextInt();
        }

        System.out.printf("%d iterations", iterations);
    }
}
