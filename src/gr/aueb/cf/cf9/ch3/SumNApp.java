package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SumNApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int i = 1;

        System.out.println("Please enter an integer number: ");
        n = scanner.nextInt();

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.printf("Tο συνολικό άθροισμα είναι: %d%n", sum);
    }
}
