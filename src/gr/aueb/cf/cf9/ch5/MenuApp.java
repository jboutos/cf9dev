package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Successful input");
                    break;
                case 2:
                    System.out.println("Successful deletion");
                    break;
                case 3:
                    System.out.println("Successful update");
                    break;
                case 4:
                    System.out.println("Successful search");
                    break;
                case 5:
                    System.out.println("Successful exit");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Please choose one of the following: ");
        System.out.println("1. Enter");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }
}
