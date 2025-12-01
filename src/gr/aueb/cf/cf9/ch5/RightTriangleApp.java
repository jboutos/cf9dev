package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;

        System.out.println("Please enter a, b and c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        isRight = Math.abs(a*a - b*b - c*c) <= EPSILON;
        System.out.printf("Triangle is right: %b", isRight);
    }
}
