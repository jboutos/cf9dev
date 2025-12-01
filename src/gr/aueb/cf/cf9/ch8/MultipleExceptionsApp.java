package gr.aueb.cf.cf9.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {
    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random-file.txt");
        int num;
        char ch;

        //first the more particular exceptions then the broader ones
        try (Scanner scanner = new Scanner(file)) {
            ch = (char) System.in.read(); //read reads a byte so we do typecast
            num = scanner.nextInt();
        } catch (FileNotFoundException e) { //this is a subclass of ioexception so we put it above it to be sure we can catch it
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.err.println("Exception: " + e);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
