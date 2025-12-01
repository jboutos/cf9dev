package gr.aueb.cf.cf9.ch3;

public class Sum10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.printf("Το άθροισμα των 10 πρώτων ακεραίων είναι: %d%n", sum);
    }
}
