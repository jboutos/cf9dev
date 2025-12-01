package gr.aueb.cf.cf9.ch6;

public class AddTwoIntsApp {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 5};
        int[] arrOut;

        arrOut = addTwoInts(arr1, arr2);

        for(int item : arrOut) {
            System.out.print(item + " ");
        }
    }

    public static int[] addTwoInts(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) return new int[0];
        if (arr1.length != arr2.length) return new int[0];

        int carry = 0;
        int sum = 0;
        int[] arrOut = new int[arr1.length + 1];

        for (int i = arr1.length - 1; i >= 0; i--) {
            sum = arr1[i] + arr2[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        arrOut[0] = carry;
        return arrOut;
    }
}
