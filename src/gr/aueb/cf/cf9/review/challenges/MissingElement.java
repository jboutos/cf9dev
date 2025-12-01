package gr.aueb.cf.cf9.review.challenges;

/**
 * We have an array[n] from 1 up to n+1
 * (fe [1,2,3,5])
 * find the missing element
 */
public class MissingElement {

    public static void main(String[] args) {

    }

    public static int findMissingElement(int[] arr) {
        //for (int i = 0; i < arr.length -1; i++) {
        //    if (arr[i] != arr[i + 1] -1) {
        //        return arr[i + 1];
        //    }
        //}

        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n * (n + 1)) / 2;

        for (int item : arr) {
            actualSum += item;
        }
        return expectedSum - actualSum;
    }
}
