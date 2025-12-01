package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών μέχρι ο χρήστης να επιλέξει exit
 */
public class MenuDoWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Choose one of the following: ");
            System.out.println("1. Insert a product");
            System.out.println("2. Delete a product");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            if (choice == 3) break;
        }

        System.out.println("Thanks for using our app");
    }
}
