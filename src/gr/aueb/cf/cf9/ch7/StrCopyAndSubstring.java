package gr.aueb.cf.cf9.ch7;

/**
 * Copy strings how? with copy of indexes
 * because strings are immutable
 */
public class StrCopyAndSubstring {
    public static void main(String[] args) {

        //copy
        String s = "Coding";
        String s2 = s;

        s2 = "Factory";

        System.out.println(s);
        System.out.println(s2);

        //substring
        String s3 = s.substring(1); //oding
        String s4 = s.substring(1, 3); //od
    }

    //traverse with substring
    public static void traverse(String s) {

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i + 1) + " ");
        }
    }
}
