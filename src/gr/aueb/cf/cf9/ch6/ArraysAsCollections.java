package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class ArraysAsCollections {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};

    }

    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for (int el : arr) {
            arrayToReturn[count++] = el;
        }

        return Arrays.copyOf(arrayToReturn, count);

        //int[] arrayToReturn = new int[count];

       // for (int i = 0; i < count; i++) {
       //     if(arr[i] % 2 == 0) {
       //         arrayToReturn[i] = arr[i];
       //     }
       // }

        //return arrayToReturn;
    }

    public static int[] mapToDouble(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }
}
