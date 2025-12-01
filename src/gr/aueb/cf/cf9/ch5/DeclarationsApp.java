package gr.aueb.cf.cf9.ch5;

public class DeclarationsApp {
    public static void main(String[] args) {
        float f1 = 1.23456789F;
        double d1 = 1.3423523414;
        final double PI = 3.14;

        //%f 6 digits precision
        System.out.printf("f1 = %.3f, d1 = %f%n", f1, d1);
    }
}
