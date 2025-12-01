package gr.aueb.cf.cf9.ch6;

public class StringVsCharArrayApp {
    public static void main(String[] args) {
        int[] ages = {20, 33, 55, 63, 17, 42, 66, 78};

        printArray(ages);
        System.out.println();
        printArray(ages, 1, ages.length - 2);
    }

    public static void printArray(int[] arr){
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        if ((low < 0 || high > arr.length - 1)) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
