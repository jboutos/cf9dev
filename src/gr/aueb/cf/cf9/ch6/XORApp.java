package gr.aueb.cf.cf9.ch6;

public class XORApp {
    public static void main(String[] args) {

    }

    //Εκτός από τις λογικές πράξεις && (Λογικό ΚAI) και || (Λογικό Η) υπάρχει
    //και μία ακόμα χρήσιμη λογική πράξη, η XOR (eXclusive OR). Η XOR είναι
    //true όταν δύο boolean είναι διαφορετικοί (0/1 ή 1/0 – true/false ή
    //false/true). H Java δεν παρέχει λογικό τελεστή XOR, μπορούμε όμως να
    //γράψουμε μία μέθοδο για το λογικό XOR όπως παραπάνω.
    //Επαληθεύεται όταν τα b1, b2 είναι true και false ή false και true που
    //είναι η λογική της XOR
    public static boolean XOR(boolean b1, boolean b2) {
        //return (b1 && !b2) || (!b1 & b2);
        return (b1 ^ b2);
    }
}
