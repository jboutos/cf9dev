package gr.aueb.cf.cf9.ch7;

/**
 * formatting primitives to strings
 */
public class StringFormatApp {
    public static void main(String[] args) {
        char row = 'B';
        int col = 8;

        String seat = String.format("%c%02d", row, col);

        System.out.println(seat);
    }
}
