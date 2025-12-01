package gr.aueb.cf.cf9.ch6;

public class ArrayMinApp2 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 8, 9, 8, 2, 11};

        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        //Ορίζουμε ως minValue το max-int, οπότε κάποιο στοιχείο θα είναι
        //μικρότερο από max-int εκτός αν όλα τα στοιχεία του πίνακα είναι max-int
        //οπότε τότε το position παραμένει 0, που είναι σωστό
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min Value: %d, Min Position: %d", minValue, minPosition + 1);
    }
}
