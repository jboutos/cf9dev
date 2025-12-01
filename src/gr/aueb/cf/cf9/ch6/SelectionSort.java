package gr.aueb.cf.cf9.ch6;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 4, 1, 2};
        int min = 0;
        int minPosition = 0;
        int tmp = 0;

        //• Βρίσκουμε το ελάχιστο κάθε υποπίνακα
        //και το ανεβάζουμε στη θέση του 1
        //ου
        //στοιχείου του υποπίνακα. Το 1
        //ο στοιχείο
        //του υποπίνακα το
        //‘κατεβάζουμε‘
        //στη
        //θέση του ελάχιστου. Άρα κάνουμε swap
        //μεταξύ των δύο στοιχείων
        //• Αυτό το κάνουμε για κάθε υποπίνακα
        //από τους n-1 υποπίνακες

        //You look at the whole row and find the smallest number.
        //Then you swap it with the first card.
        //
        //Then, you look at the rest (starting from the 2nd card),
        //find the next smallest, and swap it into place.
        //
        //You keep doing that until everything is sorted.

        //its i < arr.length - 1 because the inner loop takes care of the last element for the comparisons
        for(int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }
            tmp = arr[i];
            arr[i] = min;
            arr[minPosition] = tmp;
        }

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
