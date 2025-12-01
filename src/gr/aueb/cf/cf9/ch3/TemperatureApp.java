package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 *Ο χρήστης εισάγει ένα ακέραιο που αντιπροσωπεύει μια θερμοκρασία
 * και το πρόγραμμα υπολογίζει αν η θερμοκρασία είναι μικρότερη από το μηδέν.
 * Τότε μία μεταβλητή γίνεται true.
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTempBelowZero = false;
        int temp = 0;

        System.out.println("Please insert current temperature:");
        temp = scanner.nextInt();

        isTempBelowZero = (temp < 0);
        System.out.println("Temperature is below zero: " + isTempBelowZero);
    }
}
