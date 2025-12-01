package gr.aueb.cf.cf9.ch4;

public class UnicodeApp {
    public static void main(String[] args) {
        int codePoint = 0x1F600;
        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
