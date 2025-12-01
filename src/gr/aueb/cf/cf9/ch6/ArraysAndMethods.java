package gr.aueb.cf.cf9.ch6;

public class ArraysAndMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        printArray(arr, 0, arr.length);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    //iperfortomeni print arr
    //high is exclusive
    public static void printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length) return;
        if (low > high) return;

        for (int i = low; i < high; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] getArray5() {
        return new int[5];
    }
}
