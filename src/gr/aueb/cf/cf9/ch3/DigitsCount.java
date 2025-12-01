package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου
 */

public class DigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int digits = 0;

        System.out.println("Please enter a number: ");
        inputNum = scanner.nextInt();
        num = inputNum;

        //όταν διαιρούμε με το 10 και το αποτέλεσμα δεν είναι 0
        //σημαίνει ότι έχουμε βρει ένα ψηφίο
        do {
            digits++;
            num /= 10;
        } while (num != 0);

        System.out.printf("The number of digits in %d is: %d%n", inputNum, digits);
    }
}
