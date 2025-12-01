package gr.aueb.cf.cf9.ch7;

public class ForEachApp {
    public static void main(String[] args) {
        String s = "Coding Factory";

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }

        System.out.println("\u2764");

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();

        for (int i = s.length() -1; i >=0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
