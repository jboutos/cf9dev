package gr.aueb.cf.cf9.ch5;

public class SwapApp {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        swap(num1, num2);
        //This isn't working because the swap happening inside swap method is
        //topical, outside the swap method the changes are not valid
        System.out.printf("num1 = %d, num2 = %d", num1, num2);
    }

    public static void swap(int num1, int num2) {
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
    }
}
