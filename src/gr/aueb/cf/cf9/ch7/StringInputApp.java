package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class StringInputApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        String str2 = "";


        System.out.println("Please enter a string that ends with whitespace (enter/tab/space)");
        str = scanner.next();
        str2 = scanner.nextLine();
        //If you don’t include this, the next scanner.nextLine()
        // will immediately read the leftover \n and return an empty string.
        scanner.nextLine();
        System.out.println(str);

        System.out.println("Please enter a string that ends with enter");
        str = scanner.nextLine();
        System.out.println(str);
    }
}
