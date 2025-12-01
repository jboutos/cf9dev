package gr.aueb.cf.cf9.ch9;

import java.io.*;

public class PdfBufferedCopyApp {
    public static void main(String[] args) {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.pdf"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.pdf"))) {

            int bytesRead;
            int count = 0;
            long start, end;
            double elapsedTime = 0.0;
            byte[] buf = new byte[4096];

            start = System.currentTimeMillis();

            while ((bytesRead = bis.read(buf)) != -1) {
                bos.write(buf, 0, bytesRead);
                count += bytesRead;
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
