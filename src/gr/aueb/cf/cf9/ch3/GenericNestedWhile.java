package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class GenericNestedWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int count = 0;
        final int TIMES = 3;
        int i = 1;

        while (i <= TIMES) {
            /*ΠΡΟΣΟΧΗ αν δεν θέσουμε count = 0 στην εξωτερική λούπα
            τα counts από τις προηγούμενες εσωτερικές λούπες θα προστίθενται στις
            επόμενες
             */
            count = 0;
            System.out.println("Please enter start end and step values: ");
            start = scanner.nextInt();
            end = scanner.nextInt();
            step = scanner.nextInt();

            while (start <= end) {
                count++;
                start += step;
            }

            System.out.println("Count = " + count);
            i++;
        }
    }
}
