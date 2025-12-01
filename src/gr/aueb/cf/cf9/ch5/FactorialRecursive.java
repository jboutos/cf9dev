package gr.aueb.cf.cf9.ch5;

public class FactorialRecursive {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }

        //best practice for this a conditional return
        //return num <= 1 ? 1 : num * factorial(num - 1);
    }
}
