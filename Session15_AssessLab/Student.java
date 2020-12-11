package Session15_AssessLab;

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

       // -----------------------------------------------------------------------------------------------------------------
       // Assessable Labs Session 15 - ( Linear Functions)
       public int LinearSearchOfStudent(Student[] array, Student key) {
              for (int i = 0; i < array.length; i++) {
                     if (array[i].person.name == null ? key.person.name == null : array[i].person.name.equals(key.person.name)) {
                            return i;
                     }
              }
              return -1;
       }

       // Assessable Labs Session 15 - ( Binary Search Functions)
       public int BinarySearchOfStudent(Student[] data, Student item) throws Exception {

              int min = 0;
              int max = data.length - 1;
              int mid;
              do {
                     BubbleSortOfStudent(data);
                     mid = (min + max) / 2;
                     if (data[mid] == item) {
                            return mid;
                     }
                     if (item.compareTo(data[mid]) > 0) {
                            min = mid + 1;
                     } else {
                            max = mid - 1;
                     }
              } while (min <= max);
              return -1;
       }

       // Assessable Labs Session 15 - ( Bubble Sort Function)
       public void BubbleSortOfStudent(Student[] studentArray) throws Exception {
              Student temp;

              for (int i = 0; i <= studentArray.length - 1; i++) {
                     for (int j = i + 1; j < studentArray.length; j++) {
                            if (studentArray[i].compareToID_Name(studentArray[j]) > 0) {
                                   temp = studentArray[i];
                                   studentArray[i] = studentArray[j];
                                   studentArray[j] = temp;
                            }
                     }
              }
       }

       // Assessable Labs Session 15 - (Insertion Sort Functions)
       public void insertionSortStudent(Student[] array) {
              int j;
              for (int i = 1; i < array.length; i++) {
                     Student temp = array[i];
                     j = i;
                     while (j > 0 && array[j - 1].person.getName() == (temp.person.getName())) {
                            array[j] = array[j - 1];
                            --j;
                     }
                     array[j] = temp;
              }
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

       // Override Methods for HashCode Comparison
       @Override
       public int hashCode() {
              return Id;
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
       public int compareTo(Student other) {
              int returnValue = other.Id - Id;
              if (returnValue == 0) {
                     returnValue = other.Id;
              }
              return returnValue;
       }

       public int compareToID_Name(Student other) throws Exception {
              if (other.program == null) {
                     return 1;
              }
              if (other.equals(this)) {
                     return 0;
              }
              if (other.getClass() != this.getClass()) {
                     throw new Exception("This is a different Class");
              }
              return this.person.getName().compareTo(other.person.getName());
       }

}
