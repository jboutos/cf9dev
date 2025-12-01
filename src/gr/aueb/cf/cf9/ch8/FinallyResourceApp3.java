package gr.aueb.cf.cf9.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp3 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            num = scanner.nextInt();
            System.out.println();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
