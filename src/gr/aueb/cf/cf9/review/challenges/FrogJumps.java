package gr.aueb.cf.cf9.review.challenges;

/**
 * From spot x we want to get to y spot where
 * each jump is j.
 *
 * Say x = 10 y = 55 jump = 25 then 10 + 25 = 35 35 + 25 > 60 2 jumps
 */
public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int frogJumps(int start, int end, int jump) {
        int jumpCount = 0;

        while (start < end) {
            start += jump;
            jumpCount++;
        }
        return jumpCount;
    }

    public static int frogJumps2(int start, int end, int jump) {
        return (int) Math.ceil((end - start) / (double) jump);

        //(double) jump ensures division gives a decimal (floating-point) result.
        //
        //Math.ceil rounds up any fractional jump.
        //
        //(int) converts it back to integer for the return value.
    }
}
