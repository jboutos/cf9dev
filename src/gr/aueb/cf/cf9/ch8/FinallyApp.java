package gr.aueb.cf.cf9.ch8;

import java.lang.instrument.UnmodifiableClassException;

public class FinallyApp {
    public static void main(String[] args) {
        int num = 12;

        try {
            if (num == 12) throw new Exception();
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("Coding Factory is always executed!");
        }

        System.out.println("This piece of code is not always executed");
    }
}
