package gr.aueb.cf.cf9.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamMethod {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("/tmp/cf.txt");


        printMsg(ps, "Hello Coding Plus"); // Prints to ps
        printMsg(System.out, "Coding Factory"); // Prints to stdout
    }

    public static void printMsg(PrintStream ps, String message) {
        ps.println(message);
    }
}
