// Assessment Lab 16 - All testing shown in this file for the Ernollment LL and DLL
/* @author Paul Stuart */
package Session16_AssessLab.CustomList_Enrollment;

import Session16_AssessLab.*;

public class EnrollmentLL_TestClass {

       public static void main(String[] args) {

              //Enrollment Objects
              Enrollment e1 = new Enrollment(1, "01-02-2021", "Distinction");
              Enrollment e2 = new Enrollment(2, "03-02-2021", "Pass");
              Enrollment e3 = new Enrollment(1, "02-02-2021", "Credit");
              Enrollment e4 = new Enrollment(2, "04-02-2021", "Distinction");
              Enrollment e5 = new Enrollment(1, "08-02-2021", "Pass");
              Enrollment e6 = new Enrollment(2, "07-02-2021", "Pass");
              Enrollment e7 = new Enrollment(1, "04-02-2021", "Credit");
              Enrollment e8 = new Enrollment(2, "06-02-2021", "High Distinction");
              Enrollment e9 = new Enrollment(1, "05-02-2021", "Distinction");
              Enrollment e10 = new Enrollment(1, "01-02-2021", "Credit");

              // Linked List for Enrollment
              System.out.println("\n------------------- Linked List Demo Ernollment Class -------------------\n");
              EnrollmentLL enrollLL = new EnrollmentLL<Enrollment>();
              enrollLL.insertHead(e1);
              enrollLL.insertHead(e2);
              enrollLL.insertHead(e3);
              enrollLL.insertHead(e4);
              enrollLL.insertHead(e5);
              System.out.println("\n4 Inserts at Head Position ------------------- \n");
              enrollLL.traverse();
              System.out.println("\nInsert at Specific Position ------------------- \n");
              enrollLL.insertAt(1, e4);
              enrollLL.traverse();
              System.out.println("\n Delete at Specific Position ------------------- \n");
              enrollLL.deleteAt(1);
              enrollLL.traverse();
              System.out.println("\n Insert at Tail Position ------------------- \n");
              enrollLL.insertTail(e9);
              enrollLL.traverse();
              System.out.println("\n Delete at Tail Position ------------------- \n");
              enrollLL.deleteTail();
              enrollLL.traverse();
              System.out.println("\n Search for a Enrollment  in List - 'Sem 1, 5-02-2021', Distinction (e9) = " + (enrollLL.contains(e2)));

              // Double Linked List for Enrollment --------------------------------------------
              System.out.println("\n------------------- Double Linked List Demo Enrollment Class -------------------\n");
              EnrollmentDLL studentDLL = new EnrollmentDLL<Enrollment>();
              System.out.println("\n6 Inserts at Head Position DLL Enrollment ------------------- \n");
              studentDLL.addFirst(e3);
              studentDLL.addFirst(e5);
              studentDLL.addFirst(e6);
              studentDLL.addFirst(e4);
              studentDLL.addFirst(e1);
              System.out.println("\n Add Last DLL Enrollment ------------------- \n");
              studentDLL.addLast(e6);
              studentDLL.printDLLEnrollment();
              System.out.println("\n Remove FIrst DLL Enrollment ------------------- \n");
              studentDLL.removeFirst();
              studentDLL.printDLLEnrollment();
              System.out.println("\n Remove Last DLL Enrollment ------------------- \n");
              studentDLL.removeLast();
              studentDLL.printDLLEnrollment();
              System.out.println("\n Search for a Enrollment (e6) in List - 'Sem 2, 07-02-2021, Pass " + (studentDLL.contains(e6)));
       }

}
