package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class BingoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 11;

        while (true) {
            System.out.println("Please provide a secret num: ");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
