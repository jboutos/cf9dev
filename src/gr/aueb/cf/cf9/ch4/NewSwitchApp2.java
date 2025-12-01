package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class NewSwitchApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;
        char classification = ' ';

        System.out.println("Εισάγετε βαθμό από το 1-10: ");
        grade = scanner.nextInt();

        classification = switch (grade) {
            case 1, 2, 3, 4 -> {
                System.out.println("Fail"); //αυτή η μορφή είναι για δύο εντολές και πάνω
                yield 'F';
            }
            case 5, 6 -> 'C';
            case 7, 8 -> 'B';
            case 9, 10 -> 'A';
            default -> 'U';
        };

        System.out.println(classification);
    }
}
