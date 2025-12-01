package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class GenericWhileApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;

        System.out.println("Please insert begin value end value and step: ");
        start = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        while (start <= endValue) {
            System.out.println("start: " + start);
            counter += 1;
            start += step;
        }

        System.out.println("Iterations count: " + counter);
    }
}
