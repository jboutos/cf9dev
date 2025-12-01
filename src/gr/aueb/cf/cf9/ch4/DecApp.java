package gr.aueb.cf.cf9.ch4;

public class DecApp {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = '*';

        System.out.println("ch1 = " + ch1);
        System.out.println("ch1 = " + (int)ch1);

        System.out.println("ch2 = " + ch2);
        System.out.println("ch2 = " + (int)ch2);

        System.out.printf("%c = %d ordinal %n", ch1, (int)ch1);
        System.out.printf("%c = %d ordinal %n", ch2, (int)ch2);
    }
}
