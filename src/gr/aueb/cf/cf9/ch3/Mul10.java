package gr.aueb.cf.cf9.ch3;

public class Mul10 {
    public static void main(String[] args) {
        int result = 1;
        int i = 1;

        while (i <= 10) {
            result *= i;
            i++;
        }
        System.out.printf("The result of the multiplication is: %,d%n", result);
    }
}
