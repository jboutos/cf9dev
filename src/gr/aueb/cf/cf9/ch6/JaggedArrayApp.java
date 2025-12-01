package gr.aueb.cf.cf9.ch6;

public class JaggedArrayApp {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        //η δεύτερη διάσταση έχει διαφορετικό μήκος σε κάθε γραμμή
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[10];

        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
