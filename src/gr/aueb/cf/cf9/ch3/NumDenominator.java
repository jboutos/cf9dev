package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δύο αριθμούς, αριθμητή
 * και παρονομαστή και υπολογίζει το πηλίκο
 * αν ο numerator είναι 0 κάνουμε break
 * αν ο denominator είναι 0 κάνουμε continue
 */
public class NumDenominator {
    public static void main(String[] args) {
        int numerator = 0;
        int denominator = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please insert numerator (Quit with numerator = 0");
            numerator = scanner.nextInt();

            //Διαβάζουμε ψηλά τα λάθη και έτσι δεν έχουμε else
            if (numerator == 0) {
                System.out.println("Numerator is 0. Quitting....");
                break; //κανόνας
            }

            System.out.println("Please insert denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Can not divide by zero");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result = " + result);
        }
    }
}
