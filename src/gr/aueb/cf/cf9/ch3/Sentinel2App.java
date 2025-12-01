package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Sentinel2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please insert a number (-1 to quit): ");
        /* Προσοχή εδώ*/
        while ((num = scanner.nextInt()) != -1) {
            iterations++;
            System.out.println("Please insert a number (-1 to quit): ");
        }

        System.out.println("Positives count: " + iterations);
    }
}
