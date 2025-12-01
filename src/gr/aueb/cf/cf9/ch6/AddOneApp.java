package gr.aueb.cf.cf9.ch6;

public class AddOneApp {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] arrOut;
        arrOut = addOne(arr);

        for(int item : arrOut) {
            System.out.print(item + " ");
        }
    }

    public static int[] addOne(int[] arr) {
        if (arr == null) return null;
        int[] arrOut = new int[arr.length + 1];
        int carry = 1;
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }
        arrOut[0] = carry;
        return arrOut;
    }
}
