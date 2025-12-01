package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class AddApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;

        System.out.println("Please enter two ints: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        sum = add(a, b);
        System.out.println("Sum is: " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
