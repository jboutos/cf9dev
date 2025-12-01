package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int maxOfTwo;
        int totalMax;

        System.out.println("Please enter th three numbers:");
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        num3= scanner.nextInt();

        maxOfTwo = Math.max(num1, num2);
        totalMax = Math.max(maxOfTwo, num3);

        System.out.println("The maximum is: " + totalMax);
    }
}
