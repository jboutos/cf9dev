package gr.aueb.cf.cf9.ch6;

public class CircularRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] leftShifted = doLeftShift(arr, 2);
        int[] rightShifted = doRightShift(arr, 3);
        printArr(leftShifted);
        printArr(rightShifted);
    }

    public static int[] doRightShift(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] doLeftShift(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];
        int[] rotated = new int[arr.length];

        //with the %arr.length we make sure the index doesnt get out of bounds
        //ex arr[2+2] doesnt exist but arr[4%4 = 0] and arr[5%4 = 1]
        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }

    public static void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
