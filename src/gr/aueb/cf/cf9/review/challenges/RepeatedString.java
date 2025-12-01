package gr.aueb.cf.cf9.review.challenges;

/**
 * Given a string returns a string that is a repetition of the original string n times.
 */
public class RepeatedString {

    public static void main(String[] args) {

    }

    public static String returnString(String str, int key) {
        if (str == null || str.isBlank()) return "";

        //return str.repeat(key);

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < key; i++) { //not <= key check this out
            sb.append(str);
        }

        return sb.toString();

    }
}
