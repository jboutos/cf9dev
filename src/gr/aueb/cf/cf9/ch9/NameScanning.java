package gr.aueb.cf.cf9.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class NameScanning {
    public static void main(String[] args) {
        String inFilePath = "tmp/names.txt";
        String outFilePath = "tmp/names-formatted.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            String line;
            String[] tokens;

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, %n",
                        tokens[0], tokens[1], tokens[2]);
                System.out.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, %n",
                        tokens[0], tokens[1], tokens[2]);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, %n", tokens[0], tokens[1], tokens[2]);

    }
}
