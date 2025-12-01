package gr.aueb.cf.cf9.ch7;

/**
 * Δήλωση και αρχικοποίηση
 * ενός {@link String}.
 */
public class StringDeclaration {
    public static void main(String[] args) {
        String s = "Athens";
        String s2 = new String("Athens");
        String str3 = "";
        String str4 = null;
        boolean isEmpty;

        //isEmpty = str3.length() == 0;
        isEmpty = str3.isEmpty();

        System.out.println(s + " and " + s2);
        //attention if the addition was without parentheses it would give 53 back
        //since it would concatenate 5 and 3
        System.out.println("Total length = " + (s.length() + s2.length()));
        System.out.printf("City: %s%n", s);
    }
}
