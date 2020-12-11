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
public class CourseLLTest {

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

       public CourseLLTest() {
       }

       /**
        * Test of insertHead method, of class CourseLL.
        */
       @Test
       public void testInsertHead() {
              CourseLL courseLL = new CourseLL<Course>();
              courseLL.insertHead(c1);
              courseLL.insertHead(c2);
              courseLL.insertHead(c3);
              courseLL.insertHead(c4);
              courseLL.insertHead(c5);
              courseLL.insertHead(c6);
              courseLL.insertHead(c7);
              courseLL.insertHead(c8);
              courseLL.insertHead(c9);
       }

       /**
        * Test of insertTail method, of class CourseLL.
        */
       @Test
       public void testInsertTail() {
              CourseLL courseLL = new CourseLL<Course>();
              courseLL.insertHead(c1);
              courseLL.insertHead(c2);
              courseLL.insertHead(c3);
              courseLL.insertHead(c4);
              courseLL.insertHead(c5);
              courseLL.insertHead(c6);
              courseLL.insertHead(c7);
              courseLL.insertHead(c8);
              courseLL.insertTail(c9);
       }

       /**
        * Test of insertAt method, of class CourseLL.
        */
       @Test
       public void testInsertAt() {
              CourseLL courseLL = new CourseLL<Course>();
              courseLL.insertHead(c1);
              courseLL.insertHead(c2);
              courseLL.insertHead(c3);
              courseLL.insertHead(c4);
              courseLL.insertHead(c5);
              courseLL.insertHead(c6);
              courseLL.insertHead(c7);
              courseLL.insertHead(c8);
              courseLL.insertAt(4, c9);
       }

       /**
        * Test of deleteHead method, of class CourseLL.
        */
       @Test
       public void testDeleteHead() {
              CourseLL courseLL = new CourseLL<Course>();
              courseLL.insertHead(c1);
              courseLL.insertHead(c2);
              courseLL.insertHead(c3);
              courseLL.insertHead(c4);
              courseLL.insertHead(c5);
              courseLL.insertHead(c6);
              courseLL.insertHead(c7);
              courseLL.insertHead(c8);
              courseLL.deleteHead();
       }

       /**
        * Test of deleteTail method, of class CourseLL.
        */
       @Test
       public void testDeleteTail() {
              CourseLL courseLL = new CourseLL<Course>();
              courseLL.insertHead(c1);
              courseLL.insertHead(c2);
              courseLL.insertHead(c3);
              courseLL.insertHead(c4);
              courseLL.insertHead(c5);
              courseLL.insertHead(c6);
              courseLL.insertHead(c7);
              courseLL.insertHead(c8);
              courseLL.deleteTail();
       }

       /**
        * Test of deleteAt method, of class CourseLL.
        */
       @Test
       public void testDeleteAt() {
              CourseLL courseLL = new CourseLL<Course>();
              courseLL.insertHead(c1);
              courseLL.insertHead(c2);
              courseLL.insertHead(c3);
              courseLL.insertHead(c4);
              courseLL.insertHead(c5);
              courseLL.insertHead(c6);
              courseLL.insertHead(c7);
              courseLL.insertHead(c8);
              courseLL.deleteAt(4);
       }

       /**
        * Test of contains method, of class CourseLL.
        */
       @Test
       public void testContains() {
              CourseLL courseLL = new CourseLL<Course>();
              courseLL.insertHead(c1);
              courseLL.insertHead(c2);
              courseLL.insertHead(c3);
              courseLL.insertHead(c4);
              courseLL.insertHead(c5);
              courseLL.insertHead(c6);
              courseLL.insertHead(c7);
              courseLL.insertHead(c8);
              courseLL.contains(c5);
       }

       /**
        * Test of traverse method, of class CourseLL.
        */
       @Test
       public void testTraverse() {
              CourseLL courseLL = new CourseLL<Course>();
              courseLL.insertHead(c1);
              courseLL.insertHead(c2);
              courseLL.insertHead(c3);
              courseLL.insertHead(c4);
              courseLL.insertHead(c5);
              courseLL.insertHead(c6);
              courseLL.insertHead(c7);
              courseLL.insertHead(c8);
              courseLL.traverse();
       }

}
