package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert n: ");
        n = scanner.nextInt();


        /*
         Αν ο χρήστης δώσει 0 τότε η συνθήκη while είναι ψευδής και δεν θα
         μπούμε μέσα. Το αποτέλεσμα ωστόσο θα είναι 1 γιατί το facto έχει
         αρχικοποιηθεί στο 1. Αυτό είναι σωστό γιατί 0! = 1 εξορισμού. Τις ακραίες
         (οριακές) συνθήκες πρέπει πάντα να τις εξετάζουμε ώστε να λειτουργούν
         σωστά
         */
        while (i <= n) {
            facto *= i;
            i++;
        }
        System.out.printf("%d! = %d%n", n, facto);
    }
}
