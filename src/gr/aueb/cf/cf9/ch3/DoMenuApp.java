package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού μέχρι ο χρήστης να επιλέξει exit
 */
public class DoMenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of the following: ");
            System.out.println("1. Insert a product");
            System.out.println("2. Delete a product");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using our app");
    }
}
