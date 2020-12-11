// Assessment Lab 16 - All testing shown in this file for the Course LL and DLL
/* @author Paul Stuart */
package Session16_AssessLab.CustomList_Course;

import Session16_AssessLab.*;

public class CourseLL_TestClass {

       public static void main(String[] args) {

              // Course Objects --------------------------------------------
              Course c1 = new Course(4567, "Phys-Ed", 450f);
              Course c2 = new Course(4982, "Biology", 550f);
              Course c3 = new Course(1658, "Chemistry", 350f);
              Course c4 = new Course(4567, "Art", 400f);
              Course c5 = new Course(4567, "Maths", 380f);
              Course c6 = new Course(4567, "Advanced-Maths", 400f);
              Course c7 = new Course(4567, "Social-Studies", 420f);
              Course c8 = new Course(4567, "Physics", 390f);
              Course c9 = new Course(4567, "English", 350f);
              Course c10 = new Course(4567, "General-Science", 350f);

              // Linked List for Course --------------------------------------------
              System.out.println("\n------------------- Linked List Demo Course Class -------------------\n");
              CourseLL courseLL = new CourseLL<Course>();
              courseLL.insertHead(c1);
              courseLL.insertHead(c2);
              courseLL.insertHead(c3);
              courseLL.insertHead(c4);
              courseLL.insertHead(c5);
              courseLL.insertHead(c6);
              courseLL.insertHead(c7);
              courseLL.insertHead(c8);
              System.out.println("\n8 Inserts at Head Position ------------------- \n");
              courseLL.traverse();
              System.out.println("\nInsert at Specific Position (4) ------------------- \n");
              courseLL.insertAt(4, c4);
              courseLL.traverse();
              System.out.println("\n Delete at Specific Position ------------------- \n");
              courseLL.deleteAt(1);
              courseLL.traverse();
              System.out.println("\n Insert at Tail Position ------------------- \n");
              courseLL.insertTail(c9);
              courseLL.traverse();
              System.out.println("\n Delete at Tail Position ------------------- \n");
              courseLL.deleteTail();
              courseLL.traverse();
              System.out.println("\n Search for a  Course c7 (Social-Studies): " + (courseLL.contains(c7)));

              // Double Linked List for Course --------------------------------------------
              System.out.println("\n------------------- Double Linked List Demo Course Class -------------------\n");
              CourseDLL courseDLL = new CourseDLL<Course>();
              System.out.println("\n8 Inserts at Head Position DLL Course ------------------- \n");
              courseDLL.addFirst(c3);
              courseDLL.addFirst(c5);
              courseDLL.addFirst(c1);
              courseDLL.addFirst(c2);
              courseDLL.addFirst(c4);
              courseDLL.addFirst(c6);
              courseDLL.addFirst(c8);
              courseDLL.addFirst(c9);
              courseDLL.printDLLStudent();
              System.out.println("\n Add Last DLL Course ------------------- \n");
              courseDLL.addLast(c10);
              courseDLL.printDLLStudent();
              System.out.println("\n Remove FIrst DLL Course ------------------- \n");
              courseDLL.removeFirst();
              courseDLL.printDLLStudent();
              System.out.println("\n Remove Last DLL Course ------------------- \n");
              courseDLL.removeLast();
              courseDLL.printDLLStudent();
              System.out.println("\n Search for a  Course c4 (Art)): " + (courseLL.contains(c4)));

       }

}
