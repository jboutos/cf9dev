package gr.aueb.cf.cf9.ch11;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(); //Student() special method known as constructor (with no parameters-> default values)
        Student alice = new Student();
        Student bob = new Student();

        //command p inside() to see the order of the parameters
        Student student2 = new Student(4, "Makis", "Kapetis");
        student2.setFirstname("Chrysostomos"); //we update the value with the setter
        Student student3 = new Student(5, "Lampros", "Ioannou");
        User andreas22 = new User(1L, "Andreas", "Papadopoulos", "andrew", "12345", true);
        Product toiletPaper = new Product(1L, "Zewa", "Great quality toilet paper", 12.5, 500, true);
        Customer customer = new Customer();

        //with . we have access to public fields
        //there is an issue here with the security of the class data
        //alice .id = 1;
        //bob.id = 2;
        //student.firstname = "George";

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        student.setId(3);
        student.setFirstname("Anna");
        student.setLastname("Karenina");

        System.out.println(alice.getId());
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s%n",alice.getId(), alice.getFirstname(), alice.getLastname());
        System.out.println(Student.getStudentCount());

        System.out.println(andreas22.getUsername());
        System.out.println(andreas22.isActive());

        System.out.println(toiletPaper.getDescription());
    }
}
