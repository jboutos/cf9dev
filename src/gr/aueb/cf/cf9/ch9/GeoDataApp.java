package gr.aueb.cf.cf9.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GeoDataApp {
    public static void main(String[] args) {
        File file = new File("/tmp/locations.scv");
        String[][] geoData;

        try {
            geoData = getGeoData(file);
            for (String[] geoDatum : geoData) {
                for (String part : geoDatum) {
                    System.out.print(part + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Το αρχείο δεν βρέθηκε: " + e.getMessage());
        }
    }

    public static String[][] getGeoData(File file) throws FileNotFoundException {
        int id = 0;
        String name = null;
        double latitude = 0.0;
        double longitude = 0.0;
        String line = null;
        String[] parts = null;
        int count = -1;
        String[][] returnedArray = new String[1000][4];

        try (Scanner scanner = new Scanner(file)) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                count++;
                line = scanner.nextLine();
                parts = line.split(",");

                id = Integer.parseInt(parts[0]);
                name = parts[1];
                latitude = Double.parseDouble(parts[2]);
                longitude = Double.parseDouble(parts[3]);

                returnedArray[count] = parts;
            }
            return Arrays.copyOf(returnedArray, count + 1) ;
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
