package gr.aueb.cf.cf9.ch7;

public class StrEtc {
    public static void main(String[] args) {

        //traverse as array
        String s = "Coding Factory";

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        //replace
        String firstname = "Maria-Helen";
        //οχι σκετο replace because immutable
        String simpleName = firstname.replace("-", " ");
        System.out.println(simpleName);

        //concat
        String lastname = "Smith";
        String fullName1 = firstname + " " + lastname;
        String fullname2 = firstname.concat(" ").concat(lastname);
    }
}
