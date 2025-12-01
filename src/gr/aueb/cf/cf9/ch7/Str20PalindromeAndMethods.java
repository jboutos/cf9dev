package gr.aueb.cf.cf9.ch7;

/**
 * reverse string app
 */
public class Str20PalindromeAndMethods {
    public static void main(String[] args) {
        String s1 = "AttAA";
        System.out.println(isPalindrome(s1));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s); //equalsIgnoreCase() if we want case insensitive

        //for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
        //    if (s.charAt(i) != s.charAt(j)) {
        //        return false;
        //    }
        //}
        //return true;
    }

    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i <= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverse2(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
