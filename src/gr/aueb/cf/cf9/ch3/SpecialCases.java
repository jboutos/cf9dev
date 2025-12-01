package gr.aueb.cf.cf9.ch3;

public class SpecialCases {
    public static void main(String[] args) {
        int i =1;

        while (i < 0) {
            System.out.println("Never gets in");
        }

        while (i <= 1) {
            System.out.println("Only once");
            i++;
        }

        while (true) {
            System.out.println("Infinite loop");
        }
    }
}
