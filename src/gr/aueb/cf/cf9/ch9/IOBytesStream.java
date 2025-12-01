package gr.aueb.cf.cf9.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBytesStream {
    public static void main(String[] args) {

        try(FileInputStream in = new FileInputStream("");
        FileOutputStream out = new FileOutputStream("");)
        {
            int b, count = 0;
            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }
            System.out.printf("Το αρχείο με μέγεθος %d KBytes (%d bytes) αντιγράφηκε", count / 1024, count);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
