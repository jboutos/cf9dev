package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class FactoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter an integer: ");
        num = scanner.nextInt();

        System.out.printf("%d! = %d", num, facto(num));
    }

    /**
     * Calculates factorial of num
     * @param num
     * @return
     */
    public static int facto(int num) {
        int facto = 1;
        for (int i = 1; i <= num; i++) {
            facto *= i;
        }
        return facto;
    }
}
