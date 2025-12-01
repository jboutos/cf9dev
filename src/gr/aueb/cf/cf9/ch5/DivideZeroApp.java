package gr.aueb.cf.cf9.ch5;

public class DivideZeroApp {
    public static void main(String[] args) {
        double dividend = 17.0;
        double divisor = 0.0;
        double result = 0.0;

        result = dividend / divisor;
        System.out.println("Result is: " + result);
    }
}
