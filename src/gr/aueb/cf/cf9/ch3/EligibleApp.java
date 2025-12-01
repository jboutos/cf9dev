package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class EligibleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        final int VOTING_AGE = 18;
        boolean isEligible = false;

        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible: " + isEligible);
    }
}
