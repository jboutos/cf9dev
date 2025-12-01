package gr.aueb.cf.cf9.ch5;

public class AddApp {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sum = 0;

        //αφού η add είναι μέσα στην ίδια κλάση το AddApp.add δεν είναι απαραίτητο
        sum = AddApp.add(a, b);
        System.out.println("Sum is: " + sum);
    }

    public static int add(int a, int b) {

        //δήλωση και αρχικοποίηση
        int sum = 0;

        //εντολές
        sum = a + b;

        //επιστροφή αποτελέσματος
        return sum;
    }
}
