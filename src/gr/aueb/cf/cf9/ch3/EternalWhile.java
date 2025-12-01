package gr.aueb.cf.cf9.ch3;

public class EternalWhile {
    public static void main(String[] args) {
        int i = 1;

        while (i < 0) {
            System.out.println("NEVER gets in");
        }

        while (i <= 1) {
            System.out.println("Only ONE iteration");
            i++;
        }

        while (true) {
            System.out.println("I am ETERNAL!");
        }
    }
}
