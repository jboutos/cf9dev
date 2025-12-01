package gr.aueb.cf.cf9.ch6;

public class CombinationsApp {
    public static void main(String[] args) {
        int[] initialArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int m = 4; // Combination size (k)
        int n = initialArr.length; // Total elements (n)
        int[] row = new int[m];
        int counter = 0;

        // Corrected loop boundaries:
        for (int i = 0; i <= n - m; i++) {
            for (int j = i + 1; j <= n - (m - 1); j++) { // j <= 7
                for (int l = j + 1; l <= n - (m - 2); l++) { // l <= 8
                    for (int n_loop = l + 1; n_loop <= n - 1; n_loop++) { // n_loop <= 9
                        row[0] = initialArr[i];
                        row[1] = initialArr[j];
                        row[2] = initialArr[l];
                        row[3] = initialArr[n_loop];
                        counter++;
                        System.out.printf("%d: [%d, %d, %d, %d]%n", counter, row[0], row[1], row[2], row[3]);
                    }
                }
            }
        }
    }
}