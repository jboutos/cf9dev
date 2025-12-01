package gr.aueb.cf.cf9.ch7;

public class SubstringDemo {
    public static void main(String[] args) {
        String s = "This is AUEB";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i + 1));
        }
    }
}
