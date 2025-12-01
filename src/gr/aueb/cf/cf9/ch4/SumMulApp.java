package gr.aueb.cf.cf9.ch4;

/**
 * Άθροισμα και γινόμενο 10 πρώτων ακεραίων
 */
public class SumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }

        System.out.printf("Sum is %d%n",sum);
        System.out.printf("Mul is %,d%n",mul);
    }
}
