package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class AddOneAppRevised {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5};
        int[] newArr = addOne(arr);

        if (newArr.length == 0) {
            System.out.println("Invalid input");
        } else {
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i]);
            }
        }
    }

    public static int[] addOne(int[] arr) {
        if (arr == null) return new int[0];
        int[] newArr = new int[arr.length + 1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            newArr[i + 1] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            newArr[0] = 1;
        }
        return newArr;
    }
}
