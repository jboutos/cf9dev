package gr.aueb.cf.cf9.ch6;

public class ReplaceWithMethod {
    public static void main(String[] args) {
        int[] grades = {4, 2, 8, 9, 5};

        upscaleByOne(grades);
        printArray(grades);

        //Όπως αναφέραμε οι πίνακες
        //(δηλαδή τα περιεχόμενα των
        //πινάκων) και γενικά οι
        //σύνθετοι τύποι δεδομένων
        //περνάνε ως παράμετροι
        //μεθόδων by reference (οι
        //ίδιες οι αναφορές περνάνε
        //by value)
        //Επομένως, η ίδια η αναφορά
        //δεν μπορεί να αλλάξει μετά
        //την έξοδο από τον πίνακα,
        //αλλά οι τιμές του πίνακα
        //μπορούν να αλλάξουν
    }

    public static void upscaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
