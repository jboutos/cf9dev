package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please answer if it's raining(true/false): ");
        isRaining = scanner.nextBoolean();

        System.out.println("Please answer if it's dark(true/false): ");
        isDark = scanner.nextBoolean();

        System.out.println("Please enter the speed in km: ");
        speed = scanner.nextInt();

        lightsOn = isRaining && (isDark || speed > MAX_SPEED);
        System.out.println("The lights are on: " + lightsOn);
    }
}
