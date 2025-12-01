package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

/**
 * demo of file writers
 */
public class FileWritersJavaIO {
    public static void main(String[] args) {
        File file = new File("/Users/jboutos/IdeaProjects/CF9Dev/src/gr/aueb/cf/cf9/ch9/file.txt");


        try (PrintStream ps = new PrintStream("/Users/jboutos/IdeaProjects/CF9Dev/src/gr/aueb/cf/cf9/ch9/file-ps.txt");){
            fileWriter(file.getAbsolutePath()); //same as above
            //fileWriter("/Users/jboutos/IdeaProjects/CF9Dev/src/gr/aueb/cf/cf9/ch9/file.txt"); smae as above
            bufferedWriter(file); //same as above


            // flexible usage of sayHello()
            sayHello(System.out); //grafei sti kosnola
            sayHello(ps); //grafei hello coding ston file-ps.txt
        } catch (IOException e) {
            System.out.println("The file was not created or some error happened during write");
        }
    }

    public static void fileWriter(String file) throws IOException {
        try (FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8, true)) { //standard not necessary
            fw.write("Γειά σου World"); //char by char (12 writes to hd) no finally cause try with resources
                                            //if we want append and not create new file thrid parameter true
            fw.flush();

        } catch (IOException e) { //the file may not exist
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedWriter (File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter((new FileWriter(file, StandardCharsets.UTF_8, true)))) {
            bw.write("Γειά σου World"); //buffered writer is the preferred one filewriter is slow
            bw.newLine();
            bw.flush();
        } catch (IOException e) { //the file may not exist
            e.printStackTrace();
            throw e;
        }
    }

    public static void printStream(String file) throws IOException {
        try (PrintStream ps = new PrintStream(file)) {
            ps.println("Hello World");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printWriter(String file) throws IOException {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println("Hello World");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void sayHello(PrintStream ps) {
        ps.println("Hello Coding!");
    }

}
