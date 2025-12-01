package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class File3FileWriterPrintStream8 {
    public static void main(String[] args) {
        File fd = new File("/tmp/file-writer.txt");

        try {
            fileWriter(fd);
        } catch (IOException e) {
            System.out.println("File was not created");
        }

        try {
            bufferedWriter(fd);
        } catch (IOException e) {
            System.out.println("File was not created");
        }
    }

    public static void fileWriter(File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Coding Factory\n");
            fw.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void bufferedWriter(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Coding!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void printStream(String file) throws IOException {
        try (PrintStream ps = new PrintStream(file)) {
            ps.println("Using PrintStream");
            ps.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void printWriter(String file) throws IOException {
        try (PrintWriter ps = new PrintWriter(file)) {
            ps.println("Using PrintWriter");
            ps.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void fileReaderRead(String file) throws IOException {
        try (FileReader fr = new FileReader(file)) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "fileReaderRead" + e);
        }
    }

    public static void bufferedReaderRead(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void scannerRead(String file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(LocalDateTime.now() + "," + e);
            throw e;
        }
    }


}
