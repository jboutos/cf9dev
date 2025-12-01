package gr.aueb.cf.cf9.ch7;

public class EqualsApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "London";
        String s4 = "ATHENS";

        boolean isEqual;

        isEqual = s1.equals(s2);
        isEqual = s1.equals(s3);
        isEqual = s1.equalsIgnoreCase(s4); // isEqual is true
    }
}
