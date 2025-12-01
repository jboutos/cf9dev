package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class BingoWhileApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;
        boolean bingo = false;

        do {
            System.out.println("Please guess the key number: ");
            inputNum = scanner.nextInt();

            if (inputNum == key) {
                bingo = true;
                System.out.println("Bingo! great guess!");
            } else {
                System.out.println("Try again!");
            }
        } while (!bingo);
    }
}
