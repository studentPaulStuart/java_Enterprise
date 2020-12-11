package Session16_AssessLab;

import java.util.Objects;

public class Student implements Comparable<Student> {

    //Declare Global Constants
    public static final int DEFAULT_ID = 1111;
    public static final String DEFAULT_DATE_REG = "DD-MM-YYYY";
    public static final String DEFAULT_PROGRAM = "Null";

    int Id;
    String dateRegistered;
    String program;
    private Person person;

    // All-args Constructor with person
    public Student(int Id, String DateRegistered, String program, Person person) {
        this.person = person;
        this.Id = Id;
        this.dateRegistered = dateRegistered;
        this.program = program;
    }

    //All-args constructor no person object
    public Student(int Id, String dateRegistered, String program) {
        this.Id = Id;
        this.dateRegistered = dateRegistered;
        this.program = program;
    }

    // All Args Constructor with properties for the Person Object aggregated
    public Student(int Id, String dateRegistered, String program, String name, String email, String phone) {
        this(Id, dateRegistered, program, new Person(name, email, phone));
    }

    // No Args Constructor
    public Student() {
        this(DEFAULT_ID, DEFAULT_DATE_REG, DEFAULT_PROGRAM, new Person());
    }

    // Constructor with ID only
    public Student(int Id) {
        this.Id = Id;
    }

    // Constructor with ID and new Person Object
    public Student(int Id, String name, String email, String phone) {
        this.Id = Id;
        this.person.name = name;
        this.person.email = email;
        this.person.phone = phone;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String DateRegistered) {
        this.dateRegistered = DateRegistered;
    }

    public String getprogram() {
        return program;
    }

    public void setprogram(String program) {
        this.program = program;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNameofStudent() {
        return person.getName();
    }

    // Override Methods for HashCode Comparison
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.dateRegistered);
        hash = 97 * hash + Objects.hashCode(this.person.name);
        hash = 97 * hash + this.Id;
        return hash;
    }

    // Override Method for the Equals method Comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (this.Id == other.Id && this.person.getName() == other.person.getName()) {
            return true;
        }
        return true;
    } // End of Equals Method

    @Override
    public String toString() {
        return super.toString()
                + "["
                + "\n Person = " + this.person
                + "\n Student ID = " + this.Id
                + "\n Date Reg = " + this.dateRegistered
                + "\n Program = " + this.program
                + "]";
    }

    // CompareTo abstract Method from  (implement Comparable) to the Class
    @Override
    public int compareTo(Student o) {
        int returnValue = o.Id - Id;
        if (returnValue == 0) {
            returnValue = o.Id;
        }
        return returnValue;
    }

}
