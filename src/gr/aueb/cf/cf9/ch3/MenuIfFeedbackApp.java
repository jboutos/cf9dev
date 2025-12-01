package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class MenuIfFeedbackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Chose one of the following or 5 to exit.");
            System.out.println("1. Enter");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Succesful input");
            } else if (choice == 2) {
                System.out.println("Succesful search");
            } else if (choice == 3) {
                System.out.println("Succesful deletion");
            } else if (choice == 4) {
                System.out.println("Succesful update");
            } else if (choice == 5) {
                System.out.println("Exiting");
            } else {
                System.out.println("Wrong choice");
            }
        } while (choice != 5);

        System.out.println("Goodbye!");
    }
}
