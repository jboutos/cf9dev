package gr.aueb.cf.cf9.ch5;

public class PowerRecursive {
    public static void main(String[] args) {
        int base = 2;
        int toPower = 4;
        System.out.println(power(base, toPower));
    }

    public static int power(int base, int toPower) {
        if (toPower == 0) {
            return 1;
        } else {
            return base * power(base, toPower - 1);
        }

        //return toPower == 0 ? 1 : base * power(base, toPower - 1 );
    }
}
