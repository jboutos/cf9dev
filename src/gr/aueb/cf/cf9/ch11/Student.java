package gr.aueb.cf.cf9.ch11;

/**
 * Java Bean.
 * Data class that has private fields,
 * at least a default constructor
 * and getters and setters  with conventions.
 */
public class Student {
    //static fields belong to the class and not the instance (there is only one since its static)
    //its stored in method area
    private static int studentsCount;

    static {
        studentsCount = 0; //mainly for conditionals
    }

    private int id;
    private String firstname;
    private String lastname;

    //default constructor (will be given automatically if we dont define it)
    //it is only given automatically if there is no other overloaded constructor
    public Student() {
        studentsCount++;
    }

    //overloaded constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++; //add up every time an object is created
    }

    //right click -> generate getters and setters -> all fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //static getter no need for setter
    public static int getStudentCount() {
        return studentsCount;
        //id = 0; //for, static we cannot call non static because non static may not exist at the time static is loaded
    }
}
