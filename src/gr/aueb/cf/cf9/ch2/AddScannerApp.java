package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους από το standard input (πληκτρολόγιο) και υπολογίζει
 * το αποτέλεσμα, System.in = keyboard
 */
public class AddScannerApp {
    public static void main(String[] args) {

        //Δήλωση μεταβλητών
        //αν δεν κάνουμε import θα χρειαστεί να γράφουμε java.util.Scanner
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0, sum = 0;

        //Εντολές
        System.out.println("Please insert two ints");
        num1= scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        //Εμφάνιση αποτελεσμάτων
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d%n", num1, num2, sum);
    }
}
