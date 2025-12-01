package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Μετράμε το πλήθος των θετικών αριθμών που θα εισάγει ο χρήστης
 */
public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int positivesCount = 0;

        System.out.println("Please give a num(int): ");
        num = scanner.nextInt();

        while (num >= 0) {
            positivesCount++;
            System.out.println("Please give a num (int): ");
            num = scanner.nextInt();
        }

        System.out.println("Positive count: " + positivesCount);
    }
}
