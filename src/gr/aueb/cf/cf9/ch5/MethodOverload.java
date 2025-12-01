package gr.aueb.cf.cf9.ch5;

/**
 * Overload = Ίδιο όνομα μεθόδου/ διαφορετικές παράμετροι
 * method signature => όνομα και παράμετροι
 */
public class MethodOverload {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 15;
        int sum1 = 0;
        int sum3 = 0;
        long sum2 = 0;
        long sum4 = 0;

        sum1 = add(1, 2);
        sum2 = add(1L, 2L);
        sum3 = add(1, 2, 12);
        sum4 = add(1, 2 , 12L);

        System.out.println(sum1 + " " + sum2 + " " + sum3 + " " +sum4);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static long add(long num1, long num2, long num3) {
        return num1 + num2 + num3;
    }
}
