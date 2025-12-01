package gr.aueb.cf.cf9.ch1;

/**
 * Προσθέτει δύο ακεραίους και εμφανίζει το αποτέλεσμα στην κονσόλα.
 */
public class AddApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών.
        int num1 = 5_000_000;
        int num2 = 70_000;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος.
        System.out.println("Το αποτέλεσμα της άθροισης των " + num1 + " και " + num2 + " είναι: " + result);

        //Το κόμμα είναι διαχωριστικό χιλιάδων
        System.out.printf("Το αποτέλεσμα της άθροισης των %,d και %,d είναι: %,d\n", num1, num2, result);
    }
}
