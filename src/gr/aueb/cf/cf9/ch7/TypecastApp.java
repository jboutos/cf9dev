package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class TypecastApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please insert an int: ");
        lexeme = scanner.next();
        num = Integer.parseInt(lexeme);

        System.out.println("Num is " + num);
    }
}
