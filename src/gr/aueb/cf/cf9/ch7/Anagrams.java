package gr.aueb.cf.cf9.ch7;

public class Anagrams {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] frequency = new int[256]; //full ascii

        for (char c : str1.toCharArray()) {
            frequency[c]++; //kratame to plithos ton emfaniseon
        }

        for (char c : str2.toCharArray()) {
            frequency[c]--; //kratame to plithos ton emfaniseon
            if (frequency[c] < 0) return false; //early exit
        }

        for (int item : frequency) {
            if (item != 0) return false;
        }

        //all counts are 0
        return true;
    }
}
