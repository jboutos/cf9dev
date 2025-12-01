package gr.aueb.cf.cf9.ch2;

public class IntPrint2Demo {
    public static void main(String[] args) {
        int i =10, j=5;
        int sum = 0;

        sum = i + j;

        System.out.println("Το άθροισμα των " + i + " και " + j + " είναι " + sum + ".");
        /*
            Με το %n εκτυπώνουμε αλλαγή γραμμής σε όλα τα συστήματα (Macos windows etc)
         */
        System.out.printf("Το άθροισμα των %d και %d είναι: %d.%n", i, j, sum);
    }
}
