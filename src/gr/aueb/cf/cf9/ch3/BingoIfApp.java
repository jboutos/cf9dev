package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class BingoIfApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;

        System.out.println("Please guess the key number: ");
        inputNum = scanner.nextInt();

        if (inputNum == key) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}
