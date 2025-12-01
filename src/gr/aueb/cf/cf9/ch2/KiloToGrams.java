package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει το βάρος σε κιλά και το πρόγραμμα
 * επιστρέφει το βάρος σε γραμμάρια
 */
public class KiloToGrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilos;
        final int GRAMS_PER_KG = 1000;
        int totalGrams;

        System.out.println("Παρακαλώ εισάγετε ένα βάρος σε κιλά:");
        kilos = scanner.nextInt();
        totalGrams = kilos * GRAMS_PER_KG;

        System.out.printf("Τα %d κιλά είναι ίσα με %,d γραμμάρια", kilos, totalGrams);
    }
}
