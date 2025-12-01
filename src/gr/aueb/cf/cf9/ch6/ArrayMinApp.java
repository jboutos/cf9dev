package gr.aueb.cf.cf9.ch6;

public class ArrayMinApp {
    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 10, 4, 6, 6, 7};

        //έστω ότι το ελάχιστο στοιχείο είναι στη θέση 0
        int minPosition = 0;
        int minValue = arr[minPosition];

        //Ξεκινάμε να ελέγχουμε από την θέση 1
        //Κάθε φορά που βρίσκουμε μικρότερο στοιχείο
        //από το minValue ανανεώνουμε minPosition και minValue
        for (int i =1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        System.out.printf("Min value: %d, Min position: %d", minValue, minPosition + 1);
    }
}
