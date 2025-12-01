package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το μιν δύο αριθμών
 */
public class Ternary2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        //if (num1 < num2) {
        //  min = num1;
        //} else {            //if (num1 >= num2)
        //    min = num2;
        //}

        //Conditional assignment
        min = (num1 < num2) ? num1 : num2; //αν... εκχωρώ num1 αλλιώς num2
        System.out.println("The smallest number is: " + min);
    }
}
