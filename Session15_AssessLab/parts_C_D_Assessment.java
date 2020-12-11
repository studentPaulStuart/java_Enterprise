// Assessable Labs Session 15
package Session15_AssessLab;

// Search and Sort for a list of students
public class parts_C_D_Assessment {

       public static void main(String[] args) throws Exception {

              Person p1 = new Person("James", "jim@gmail.com", "458719974");
              Person p2 = new Person("Aaron", "aaron@gmail.com", "12368496");
              Person p3 = new Person("Stacey", "stacey@gmail.com", "45689248");
              Person p4 = new Person("Seth", "seth@gmail.com", "04256897");
              Person p5 = new Person("Jake", "jake@gmail.com", "04568125");
              Person p6 = new Person("Alison", "alsion@gmail.com", "043219875");
              Person p7 = new Person("Bridgette", "bridgette@gmail.com", "04125896");

              Student s1 = new Student(123, "01-02-2020", "English");
              Student s2 = new Student(568, "04-02-2020", "English");
              Student s3 = new Student(731, "02-02-2020", "Sports");
              Student s4 = new Student(197, "07-02-2020", "Sports");
              Student s5 = new Student(845, "01-02-2020", "Maths");
              Student s6 = new Student(962, "31-12-2019", "Chemistry");
              Student s7 = new Student(458, "04-02-2020", "Physics");
              Student s8 = new Student(159, "05-02-2020", "Sports");

              s1.setPerson(p1);
              s2.setPerson(p2);
              s3.setPerson(p3);
              s4.setPerson(p4);
              s5.setPerson(p5);
              s6.setPerson(p6);
              s7.setPerson(p7);

              Student[] studentList = {s1, s2, s3, s4, s5, s6, s7};

              // Search Student With with method in the Student Class
              System.out.println("\n Assessable labs Session 15 - Searching and Sorting");
              System.out.println("\n Pre-sorted Array ------------------------------------------------------------------\n");
              for (int i = 0; i < studentList.length; i++) {
                     System.out.println(studentList[i].toString() + "\n");
              }
              System.out.println("\n Bubble-sorted Array ---------------------------------------------------------------\n");
              s1.BubbleSortOfStudent(studentList);
              for (int i = 0; i < studentList.length; i++) {
                     System.out.println(studentList[i].toString() + "\n");
              }
              System.out.println("\n Insertion-sorted Array ---------------------------------------------------------------\n");
              s1.insertionSortStudent(studentList);
              for (int i = 0; i < studentList.length; i++) {
                     System.out.println(studentList[i].toString() + "\n");
              }
              
              System.out.println("\n Searching Functions ---------------------------------------------------------------\n");
              System.out.println("\nStudent Seth was found using linear Search at index: " + s4.LinearSearchOfStudent(studentList, s4));
              System.out.println("\nStudent Bridgette was found using Binary Search at index: " + s4.BinarySearchOfStudent(studentList, s4));

       }

}
