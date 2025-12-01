package gr.aueb.cf.cf9.ch6;

/**
 * εκτυπώνει με for each
 */
public class ArrayForEachApp {
    public static void main(String[] args) {
        int[] ages = {19, 29, 22, 40};

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
