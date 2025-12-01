package gr.aueb.cf.cf9.ch7;

public class StringSplit {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        String[] tokens = s.split(" +"); //one or more empty spaces

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
