package gr.aueb.cf.cf9.ch6;

public class ArrayMinGenericMethodApp {
    public static void main(String[] args) {
        int[] grades = {4, 8, 3, 10, 6, 2, 1, 4};
        int minPosition = 0;

        minPosition = getMinPosition(grades, 0, grades.length - 1);

        //+1 για να είναι user-friendly
        System.out.printf("Min value: %d, Min Position: %d", grades[minPosition], minPosition + 1);
    }

    public static int getMinPosition(int[] arr, int low, int high) {
        int minPosition = low;
        int minValue;

        if((low < 0 || high > arr.length -1)) {
            System.out.println("Error in array dimensions");
            return -1;
        }

        minValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }
}
