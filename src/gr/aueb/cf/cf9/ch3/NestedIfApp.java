package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class NestedIfApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int modulesCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please enter the sum of grades: ");
        totalMarks = scanner.nextInt();

        System.out.println("Please insert modules' count: ");
        modulesCount = scanner.nextInt();

        if (modulesCount == 0) {
            System.out.println("Modules count can not be 0");
            System.exit(1);
        }

        average = totalMarks / modulesCount;
        if (average < 0 || average > 10) {
            System.out.println("Error in input data");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent: " + average);
        } else if (average >= 7) {
            System.out.println("Very good: " + average);
        } else if (average >= 5) {
            System.out.println("Good: " + average);
        } else {
            System.out.println("Fail: " + average);
        }
    }
}
