package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * {@link BankApp} offers only one service, depositing
 */
public class SimpleBank {
    static double balance = 0.0; //global variable because deposit is static

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;

        try {
            System.out.println("Please enter a deposit amount");
            amount = scanner.nextDouble();
            deposit(amount);
            System.out.println("The amount after the deposit is: " + balance);
        } catch (Exception e) {
            System.out.println("You cannot deposit a negative amount"); //we talk to the user with e.getmessage we get the message below
        }
    }

    public static void deposit(double amount) throws Exception {
        //something that is throwed in the body must be in the title too
        //if we use catch we can remove throws for the title but we should not
        // and if we throw e then we must add it
        //separation of concerns no sout here
        //why not return -1? With exceptions main will know of the failure
        //we need logging of the errors (with try catch)
        try {
            if (amount < 0) throw new Exception("Deposit amount must be positive"); //this is the message of the exception
            balance += amount;
            //logging
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage()); //logging
            throw e; //rethrowing the exception because we caught it
        }
    }

    public static String printLocalizedMessage(String lang) {
        return switch (lang) {
            case "el" -> "Δεν μπορεί να γίνει κατάθεση αρνητικού ποσού";
            case "en" -> "Cannot deposit a negative amount";
            case "de" -> "Es kann kein negativer Betrag eingezahlt werden";
            default -> "Unknown language";
        };
    }
}
