/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session16_AssessLab.CustomList_Enrollment;

import Session16_AssessLab.Enrollment;
import org.junit.Test;

/**
 *
 * @author pauls
 */
public class EnrollmentLLTest {

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
       
       public EnrollmentLLTest() {
       }

       /**
        * Test of insertHead method, of class EnrollmentLL.
        */
       @Test
       public void testInsertHead() {
              EnrollmentLL enrollLL = new EnrollmentLL<Enrollment>();
              enrollLL.insertHead(e1);
              enrollLL.insertHead(e2);
              enrollLL.insertHead(e3);
              enrollLL.insertHead(e4);
              enrollLL.insertHead(e5);
              enrollLL.insertHead(e9);
       }

       /**
        * Test of insertTail method, of class EnrollmentLL.
        */
       @Test
       public void testInsertTail() {
              EnrollmentLL enrollLL = new EnrollmentLL<Enrollment>();
              enrollLL.insertHead(e1);
              enrollLL.insertHead(e2);
              enrollLL.insertHead(e3);
              enrollLL.insertHead(e4);
              enrollLL.insertHead(e5);
              enrollLL.insertTail(e8);
       }

       /**
        * Test of insertAt method, of class EnrollmentLL.
        */
       @Test
       public void testInsertAt() {
              EnrollmentLL enrollLL = new EnrollmentLL<Enrollment>();
              enrollLL.insertHead(e1);
              enrollLL.insertHead(e2);
              enrollLL.insertHead(e3);
              enrollLL.insertHead(e4);
              enrollLL.insertHead(e5);
              enrollLL.insertAt(2, e7);
       }

       /**
        * Test of deleteHead method, of class EnrollmentLL.
        */
       @Test
       public void testDeleteHead() {
              EnrollmentLL enrollLL = new EnrollmentLL<Enrollment>();
              enrollLL.insertHead(e1);
              enrollLL.insertHead(e2);
              enrollLL.insertHead(e3);
              enrollLL.insertHead(e4);
              enrollLL.insertHead(e5);
              enrollLL.deleteHead();
       }

       /**
        * Test of deleteTail method, of class EnrollmentLL.
        */
       @Test
       public void testDeleteTail() {
              EnrollmentLL enrollLL = new EnrollmentLL<Enrollment>();
              enrollLL.insertHead(e1);
              enrollLL.insertHead(e2);
              enrollLL.insertHead(e3);
              enrollLL.insertHead(e4);
              enrollLL.insertHead(e5);
              enrollLL.deleteTail();
       }

       /**
        * Test of deleteAt method, of class EnrollmentLL.
        */
       @Test
       public void testDeleteAt() {
              EnrollmentLL enrollLL = new EnrollmentLL<Enrollment>();
              enrollLL.insertHead(e1);
              enrollLL.insertHead(e2);
              enrollLL.insertHead(e3);
              enrollLL.insertHead(e4);
              enrollLL.insertHead(e5);
              enrollLL.deleteAt(3);
       }

       /**
        * Test of contains method, of class EnrollmentLL.
        */
       @Test
       public void testContains() {
              EnrollmentLL enrollLL = new EnrollmentLL<Enrollment>();
              enrollLL.insertHead(e1);
              enrollLL.insertHead(e2);
              enrollLL.insertHead(e3);
              enrollLL.insertHead(e4);
              enrollLL.insertHead(e5);
              enrollLL.contains(e3);
       }

       /**
        * Test of traverse method, of class EnrollmentLL.
        */
       @Test
       public void testTraverse() {
              EnrollmentLL enrollLL = new EnrollmentLL<Enrollment>();
              enrollLL.insertHead(e1);
              enrollLL.insertHead(e2);
              enrollLL.insertHead(e3);
              enrollLL.insertHead(e4);
              enrollLL.insertHead(e5);
              enrollLL.traverse();
       }
       
}
