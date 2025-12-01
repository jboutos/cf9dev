package gr.aueb.cf.cf9.ch7;

public class CharCount {
    public static void main(String[] args) {

    }

    public static int characterCount(String s) {
        if (s == null) return 0; //we dont want the pointer to be null
        return s.length();
    }

    public static int countSpecificChar(String s, char letter) {
        if (s == null) return 0;
        int count = 0;

        for (int i =0; i < s.length(); i++) {
            if (s.charAt(i) == letter) { //we have chars so we can do ==
                count++;
            }
        }
        return count;
    }
}
