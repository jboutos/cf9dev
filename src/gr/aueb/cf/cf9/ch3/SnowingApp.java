package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it is raining (true/false): ");
        isRaining = scanner.nextBoolean();

        System.out.println("Please enter the temperature: ");
        temp = scanner.nextInt();
        isSnowing = isRaining && (temp < 0); //short circuit operator (if the first is false it stops)

        System.out.println("Is snowing: " + isSnowing);
    }
}
