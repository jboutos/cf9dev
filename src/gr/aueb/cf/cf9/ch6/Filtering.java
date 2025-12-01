package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class Filtering {
    public static void main(String[] args) {
        int[] grades = new int[] {4, 9, 9, 8, 7, 2, 1, 4, 10};
        int PASS = 5;

        int[] passed = getPassedGrades(grades, PASS);
        for (int pass : passed) {
            System.out.println(pass + " ");
        }
    }

    public static int[] getPassedGrades(int[] grades, int passThreshold) {
        if (grades == null || grades.length == 0) return new int[0];

        int count = 0;
        int[] temp = new int[grades.length];

        for (int el : grades) {
            if (el >= passThreshold) {
                temp[count++] = el;
            }
        }

        //count is the length of the array here
        //so while we increment count after the last passing grade it's still right
        return Arrays.copyOf(temp, count);
    }

}
