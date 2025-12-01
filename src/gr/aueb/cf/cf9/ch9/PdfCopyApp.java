package gr.aueb.cf.cf9.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfCopyApp {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("");
             FileOutputStream fos = new FileOutputStream("")) {

                 int b;
                 int count = 0;
                 long start;
                 long end;
                 double elapsedTime = 0.0;

                 start = System.currentTimeMillis();
                 while ((b = fis.read()) != -1) {
                     fos.write(b);
                     count++;
                 }
                 end = System.currentTimeMillis();
                 elapsedTime = (end - start) / 1000.0;

                 System.out.printf("The file with size %dKB (%d bytes) was successfully copied", count / 1024, count);
                 System.out.println("Elapsed time: " + elapsedTime + " seconds");

             } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
