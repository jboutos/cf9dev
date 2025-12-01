package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία του σε ημέρες, όπου
 * θεωρούμε το 1 έτος = 365 μέρες
 */
public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = 0;

        //αν δεν είχαμε το final int το 365 θα έστεκε μόνο του ως μαγικός αριθμός που δεν το θέλουμε
        final int DAYS_PER_YEAR = 365;
        int totalDays = 0;

        System.out.println("Παρακαλώ εισάγετε την ηλικία σας σε χρόνια:");
        years = scanner.nextInt();
        totalDays = years * DAYS_PER_YEAR;

        System.out.printf("Τα %d χρόνια είναι %d μέρες%n", years, totalDays);
    }
}
