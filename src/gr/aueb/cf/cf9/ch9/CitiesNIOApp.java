package gr.aueb.cf.cf9.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CitiesNIOApp {

    public static void main(String[] args) {
        String line;
        String[] cities;

        try (BufferedReader bf = new BufferedReader(new FileReader("/tmp/cities.txt"))) {
            Path dir = Paths.get("/tmp/cities");
            if (Files.notExists(dir)) Files.createDirectory(dir);
            Path path;

            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");
                switch(cities[0]) {
                    case "Greece":
                        path = dir.resolve("gr.txt");
                        PrintStream gr = new PrintStream(path.toFile(), StandardCharsets.UTF_8);
                        print(gr, "GR Cities");
                        print(gr, cities);
                        break;
                        case "USA":
                            path = dir.resolve("usa.txt");
                            PrintStream usa = new PrintStream(path.toFile(), StandardCharsets.UTF_8);
                            print(usa, "USA Cities");
                            print(usa, cities);
                            break;
                        case "Germany":
                            path = dir.resolve("de.txt");
                            PrintStream de = new PrintStream(path.toFile(), StandardCharsets.UTF_8);
                            print(de, "DE Cities");
                            print(de, cities);
                            break;
                        default:
                            System.out.println("Error in cities");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
        }
    }

    public static void print(PrintStream ps, String message) {
        ps.println(message);
    }
}
