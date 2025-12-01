package gr.aueb.cf.cf9.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 12;
        int num2 = 5;
        int sum = 0, sub = 0; //not a best practice, it's better to have separate ints
        int div = 0, mul = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;

        //Εντολές
        sum = num1 + num2;
        sub = num1 - num2;
        div = num1 / num2; //Η διαίρεση ακεραίων δίνει πάντα ακέραιο
        mul = num1 * num2;
        mod = num1 % num2; //Το υπόλοιπο της διαίρεσης

        result1 = ++num1; //πρώτα num1 + 1 μετά εκχώρηση
        result2 = num1++; //πρώτα εκχώρηση μετά num1 + 1
        result3 += num1; //τελεστής σύντμησης
        //result3++ same as result3 + 1 same as result3 += 1 (result3 = result3 + 1)
        //result3++ and ++result3 is the same

        result4 = (num1 + num2) * ((num1 / 2) / (num1 % 5));

        System.out.printf("sum: %d\t, sub: %d\t, div: %d\t, mul: %d\t, mod: %d%n", sum, sub, div, mul, mod);
        System.out.printf("result1: %d, result2: %d, result3: %d, result4: %d", result1, result2, result3, result4);
    }
}
