package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν χρόνο σε ώρες και το
 * πρόγραμμα επιστρέφει τον χρόνο σε λεπτά και δευτερόλεπτα
 */
public class HoursToMinSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_MINUTE = 60;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Παρακαλώ εισάγετε τον χρόνο σε ώρες:");
        hours = scanner.nextInt();

        minutes = (int) (hours * MINUTES_PER_HOUR);
        seconds = (int) (minutes * SECONDS_PER_MINUTE);

        System.out.printf(Locale.US, "Οι %,d ώρες είναι ίσες με %,d λεπτά και %,d δευτερόλεπτα%n", hours, minutes, seconds);
        System.out.printf(Locale.forLanguageTag("el"), "Οι %,d ώρες είναι ίσες με %,d λεπτά και %,d δευτερόλεπτα%n", hours, minutes, seconds);
    }
}
