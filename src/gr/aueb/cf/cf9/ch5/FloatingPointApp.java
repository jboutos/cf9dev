package gr.aueb.cf.cf9.ch5;

public class FloatingPointApp {
    public static void main(String[] args) {
        final int BITS_PER_BYTE = 8;

        //η τελεία (.2) υποδηλώνει την ακρίβεια των δεκαδικών
        System.out.printf("Float Size: %d, Min: %.2e, Max: %.2e%n", Float.SIZE * BITS_PER_BYTE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double Size: %d, Min: %.2e, Max: %.2e%n", Double.SIZE * BITS_PER_BYTE, Double.MIN_VALUE, Double.MAX_VALUE);
    }
}
