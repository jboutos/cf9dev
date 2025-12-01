package gr.aueb.cf.cf9.ch6;

public class CombinationsAppWithFilter {
    public static void main(String[] args) {
        int[] initialArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int m = 4; // Combination size (k)
        int n = initialArr.length; // Total elements (n)
        int[] row = new int[m];
        int counter = 0;

        // Corrected loop boundaries:
        // i starts at 0 and goes up to n - m
        for (int i = 0; i <= n - m; i++) {
            // j starts at i + 1 and goes up to n - m + 1
            for (int j = i + 1; j <= n - m + 1; j++) {
                // l starts at j + 1 and goes up to n - m + 2
                for (int l = j + 1; l <= n - m + 2; l++) {
                    // n_loop starts at l + 1 and goes up to n - 1 (the last index)
                    for (int n_loop = l + 1; n_loop <= n - 1; n_loop++) {
                        counter++;
                        row[0] = initialArr[i];
                        row[1] = initialArr[j];
                        row[2] = initialArr[l];
                        row[3] = initialArr[n_loop];
                        if (!isEven(row, 2)) {
                            System.out.printf("%4d. \t%d\t%d\t%d\t%d%n", counter, row[0], row[1], row[2], row[3]);
                        }
                    }
                }
            }
        }
    }

    public static boolean isEven(int[] row, int threshold) {
        int evens = 0;

        for (int num : row) {
            if (num % 2 == 0) evens++;
        }

        return evens > threshold;
    }
}
