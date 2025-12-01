package gr.aueb.cf.cf9.ch7;

public class ConcatApp {
    public static void main(String[] args) {
        String firstname = "Athanasios";
        String lastname = "Androutsos";
        String title = "Dr.";
        String fullName1, fullName2, fullName3, fullName4;

        fullName1 = firstname + lastname;
        fullName2 = title + firstname + lastname;

        fullName3 = firstname.concat(lastname);
        fullName4 = title.concat(firstname).concat(lastname);

        System.out.printf("Firstname: %s, Lastname: %s", firstname, lastname);
        System.out.printf("Full name 1: %s", fullName1);
        System.out.printf("Full name 2: %s", fullName2);
        System.out.printf("Full name 3: %s", fullName3);
        System.out.printf("Full name 4: %s", fullName4);
    }
}
