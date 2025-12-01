package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {
    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); //1
        int positionOfNexto = cf.indexOf("o, 2"); //11

        int positionOfLasto = cf.lastIndexOf("o"); //11
        System.out.println(positionOfLasto);
    }

    //επιστρεφει την καταληξη ενος αρχειου
    public static String getExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);

    }
}
