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
public class EnrollmentDLLTest {

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

       public EnrollmentDLLTest() {
       }

       /**
        * Test of addFirst method, of class EnrollmentDLL.
        */
       @Test
       public void testAddFirst() {
              EnrollmentDLL studentDLL = new EnrollmentDLL<Enrollment>();
              studentDLL.addFirst(e1);
              studentDLL.addFirst(e2);
              studentDLL.addFirst(e3);
              studentDLL.addFirst(e4);
              studentDLL.addFirst(e5);
              studentDLL.addFirst(e6);
              studentDLL.addFirst(e7);
              studentDLL.addFirst(e8);
              studentDLL.addFirst(e9);

       }

       /**
        * Test of addLast method, of class EnrollmentDLL.
        */
       @Test
       public void testAddLast() {
              EnrollmentDLL studentDLL = new EnrollmentDLL<Enrollment>();
              studentDLL.addFirst(e1);
              studentDLL.addFirst(e2);
              studentDLL.addFirst(e3);
              studentDLL.addFirst(e4);
              studentDLL.addFirst(e5);
              studentDLL.addFirst(e6);
              studentDLL.addFirst(e7);
              studentDLL.addFirst(e8);
              studentDLL.addLast(e9);
       }

       /**
        * Test of removeFirst method, of class EnrollmentDLL.
        */
       @Test
       public void testRemoveFirst() {
              EnrollmentDLL studentDLL = new EnrollmentDLL<Enrollment>();
              studentDLL.addFirst(e1);
              studentDLL.addFirst(e2);
              studentDLL.addFirst(e3);
              studentDLL.addFirst(e4);
              studentDLL.addFirst(e5);
              studentDLL.addFirst(e6);
              studentDLL.addFirst(e7);
              studentDLL.addFirst(e8);
              studentDLL.removeFirst();
       }

       /**
        * Test of removeLast method, of class EnrollmentDLL.
        */
       @Test
       public void testRemoveLast() {
              EnrollmentDLL studentDLL = new EnrollmentDLL<Enrollment>();
              studentDLL.addFirst(e1);
              studentDLL.addFirst(e2);
              studentDLL.addFirst(e3);
              studentDLL.addFirst(e4);
              studentDLL.addFirst(e5);
              studentDLL.addFirst(e6);
              studentDLL.addFirst(e7);
              studentDLL.addFirst(e8);
              studentDLL.removeLast();
       }

       /**
        * Test of contains method, of class EnrollmentDLL.
        */
       @Test
       public void testContains() {
              EnrollmentDLL studentDLL = new EnrollmentDLL<Enrollment>();
              studentDLL.addFirst(e1);
              studentDLL.addFirst(e2);
              studentDLL.addFirst(e3);
              studentDLL.addFirst(e4);
              studentDLL.addFirst(e5);
              studentDLL.addFirst(e6);
              studentDLL.addFirst(e7);
              studentDLL.addFirst(e8);
              studentDLL.contains(e6);
       }

       /**
        * Test of printDLLEnrollment method, of class EnrollmentDLL.
        */
       @Test
       public void testPrintDLLEnrollment() {
              EnrollmentDLL studentDLL = new EnrollmentDLL<Enrollment>();
              studentDLL.addFirst(e1);
              studentDLL.addFirst(e2);
              studentDLL.addFirst(e3);
              studentDLL.addFirst(e4);
              studentDLL.addFirst(e5);
              studentDLL.addFirst(e6);
              studentDLL.addFirst(e7);
              studentDLL.addFirst(e8);
              studentDLL.printDLLEnrollment();
       }

}
