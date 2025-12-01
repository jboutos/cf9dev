package gr.aueb.cf.cf9.ch8;

public class ArrayIndexOutOfBoundsExceptionApp {
    public static void main(String[] args) {
        int[] arr = {11, 2, 35};

        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
