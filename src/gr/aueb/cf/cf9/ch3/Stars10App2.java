package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Stars10App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("Please enter number of iterations: ");
        n = scanner.nextInt();

        while (i <= n) {
            System.out.print("*");
            i++;
        }
    }
}
