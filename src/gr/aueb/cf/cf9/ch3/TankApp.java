package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class TankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Is tank 1 empty?(true/false): ");
        isEmptyTank1 = scanner.nextBoolean();

        System.out.println("Is tank 2 empty?(true/false): ");
        isEmptyTank2 = scanner.nextBoolean();

        /*προσοχή, με isEmpty1 || isEmpty2 θα είναι πορτοκαλί αν είναι και οι δύο δεξαμενές true(άδειες),
        με ^ θα είναι πορτοκαλί μόνο αν η μία εκ των δύο είναι true...
         */
        /*isOrange = (isEmptyTank1 == true && isEmptyTank2 == false) || (isEmptyTank1 == false && isEmptyTank2 == true);*/
        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.printf("The output is orange: %b, the output is red: %b%n", isOrange, isRed);
    }
}
