package gr.aueb.cf.cf9.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp2 {
    public static void main(String[] args) {
        int num = 0;

        try (Scanner scanner = new Scanner(new File("/Users/jboutos/something.txt"))) {
            num = scanner.nextInt();
            System.out.println("num: " + num);
        } catch (InputMismatchException | FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } //autoclose don't need finally
    }
}
