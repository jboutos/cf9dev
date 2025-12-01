package gr.aueb.cf.cf9.ch2;

/**
 * Παράγει έναν τυχαίο ακέραιο μεταξύ 1 και 6
 */
public class RandomDemo {
    public static void main(String[] args) {

        int die = 0;

        //Με το typecast σε int το 5.94 γίνεται 5
        //max - min + 1 for random
        //το typecast εφαρμόζεται πάντα στο αμέσως επόμενο μέρος!!!
        die = (int) (Math.random() * 6) + 1;

        System.out.println(die);
    }
}
