/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session16_AssessLab.CustomList_Course;

import Session16_AssessLab.Course;
import org.junit.Test;

/**
 *
 * @author pauls
 */
public class CourseDLLTest {

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

       public CourseDLLTest() {
       }

       /**
        * Test of addFirst method, of class CourseDLL.
        */
       @Test
       public void testAddFirst() {
              CourseDLL courseDLL = new CourseDLL<Course>();
              courseDLL.addFirst(c1);
              courseDLL.addFirst(c2);
              courseDLL.addFirst(c3);
              courseDLL.addFirst(c4);
              courseDLL.addFirst(c5);
              courseDLL.addFirst(c6);
              courseDLL.addFirst(c7);
              courseDLL.addFirst(c8);
              courseDLL.addFirst(c9);

       }

       /**
        * Test of addLast method, of class CourseDLL.
        */
       @Test
       public void testAddLast() {
              CourseDLL courseDLL = new CourseDLL<Course>();
              courseDLL.addFirst(c1);
              courseDLL.addFirst(c2);
              courseDLL.addFirst(c3);
              courseDLL.addFirst(c4);
              courseDLL.addFirst(c5);
              courseDLL.addFirst(c6);
              courseDLL.addFirst(c7);
              courseDLL.addFirst(c8);
              courseDLL.addLast(c9);
       }

       /**
        * Test of removeFirst method, of class CourseDLL.
        */
       @Test
       public void testRemoveFirst() {
              CourseDLL courseDLL = new CourseDLL<Course>();
              courseDLL.addFirst(c1);
              courseDLL.addFirst(c2);
              courseDLL.addFirst(c3);
              courseDLL.addFirst(c4);
              courseDLL.addFirst(c5);
              courseDLL.addFirst(c6);
              courseDLL.addFirst(c7);
              courseDLL.addFirst(c8);
              courseDLL.removeFirst();
       }

       /**
        * Test of removeLast method, of class CourseDLL.
        */
       @Test
       public void testRemoveLast() {
              CourseDLL courseDLL = new CourseDLL<Course>();
              courseDLL.addFirst(c1);
              courseDLL.addFirst(c2);
              courseDLL.addFirst(c3);
              courseDLL.addFirst(c4);
              courseDLL.addFirst(c5);
              courseDLL.addFirst(c6);
              courseDLL.addFirst(c7);
              courseDLL.addFirst(c8);
              courseDLL.removeLast();
       }

       /**
        * Test of contains method, of class CourseDLL.
        */
       @Test
       public void testContains() {
              CourseDLL courseDLL = new CourseDLL<Course>();
              courseDLL.addFirst(c1);
              courseDLL.addFirst(c2);
              courseDLL.addFirst(c3);
              courseDLL.addFirst(c4);
              courseDLL.addFirst(c5);
              courseDLL.addFirst(c6);
              courseDLL.addFirst(c7);
              courseDLL.addFirst(c8);
              courseDLL.contains(c5);
       }

       /**
        * Test of printDLLStudent method, of class CourseDLL.
        */
       @Test
       public void testPrintDLLStudent() {
              CourseDLL courseDLL = new CourseDLL<Course>();
              courseDLL.addFirst(c1);
              courseDLL.addFirst(c2);
              courseDLL.addFirst(c3);
              courseDLL.addFirst(c4);
              courseDLL.addFirst(c5);
              courseDLL.addFirst(c6);
              courseDLL.addFirst(c7);
              courseDLL.addFirst(c8);
              courseDLL.printDLLStudent();
       }

}
