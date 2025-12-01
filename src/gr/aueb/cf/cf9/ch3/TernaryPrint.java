package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Βρίσκει τον απόλυτο ενός ακεραίου και τον εμφανίζει
 * άμεσα στην printf
 */
public class TernaryPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Please insert a num:");
        num1 = scanner.nextInt();

        System.out.printf("Abs of %d is %d&n", num1, (num1 > 0) ? num1 : -num1);
    }
}
