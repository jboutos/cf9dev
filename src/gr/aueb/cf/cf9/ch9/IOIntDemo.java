package gr.aueb.cf.cf9.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class IOIntDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/jboutos/jtmp/test/intIn.txt"));
        PrintStream ps = new PrintStream("/Users/jboutos/jtmp/test/intOut.txt");
        String token;
        int num = 0;
        int sum = 0;
        int count = 0;
        double average = 0.0;

        while (scanner.hasNext()) {
            token = scanner.next();
            if (isInt(token)) {
                num = Integer.parseInt(token);
                count++;
                sum += num;
            }
        }

        average = (double) sum / count;
        ps.printf("The sum is %d%n", sum);
        ps.printf(Locale.ENGLISH, "The average is %.2f", average);

        scanner.close();
        ps.close();
    }

    public static boolean isInt(String s) {
        return s.matches("-?\\d+");
    }
}
