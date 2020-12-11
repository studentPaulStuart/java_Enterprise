/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session16_AssessLab.CustomList_Student;

import Session16_AssessLab.Person;
import Session16_AssessLab.Student;
import org.junit.Test;

/**
 *
 * @author pauls
 */
public class StudentLLTest {

       // Person Objects --------------------------------------------
       Person p1 = new Person("James", "jim@gmail.com", "458719974");
       Person p2 = new Person("Aaron", "aaron@gmail.com", "12368496");
       Person p3 = new Person("Stacey", "stacey@gmail.com", "45689248");
       Person p4 = new Person("Seth", "seth@gmail.com", "04256897");
       Person p5 = new Person("Jake", "jake@gmail.com", "04568125");
       Person p6 = new Person("Alison", "alsion@gmail.com", "043219875");
       Person p7 = new Person("Bridgette", "bridgette@gmail.com", "04125896");
       // Student Objects --------------------------------------------
       Student s1 = new Student(123, "01-02-2020", "English", p1);
       Student s2 = new Student(568, "04-02-2020", "English", p2);
       Student s3 = new Student(731, "02-02-2020", "Sports", p3);
       Student s4 = new Student(197, "07-02-2020", "Sports", p4);
       Student s5 = new Student(845, "01-02-2020", "Maths", p5);
       Student s6 = new Student(962, "31-12-2019", "Chemistry", p6);
       Student s7 = new Student(458, "04-02-2020", "Physics", p7);

       public StudentLLTest() {
       }

       /**
        * Test of insertHead method, of class StudentLL.
        */
       @Test
       public void testInsertHead() {
              StudentLL studentLL = new StudentLL<Student>();
              studentLL.insertHead(s1);
              studentLL.insertHead(s2);
              studentLL.insertHead(s3);
              studentLL.insertHead(s5);
       }

       /**
        * Test of insertTail method, of class StudentLL.
        */
       @Test
       public void testInsertTail() {
              StudentLL studentLL = new StudentLL<Student>();
               studentLL.insertHead(s1);
              studentLL.insertHead(s2);
              studentLL.insertHead(s3);
              studentLL.insertHead(s5);
              studentLL.insertTail(s6);
       }

       /**
        * Test of insertAt method, of class StudentLL.
        */
       @Test
       public void testInsertAt() {
               StudentLL studentLL = new StudentLL<Student>();
                studentLL.insertHead(s1);
              studentLL.insertHead(s2);
              studentLL.insertHead(s3);
              studentLL.insertHead(s5);
              studentLL.insertAt(2, s7);
       }

       /**
        * Test of deleteHead method, of class StudentLL.
        */
       @Test
       public void testDeleteHead() {
              StudentLL studentLL = new StudentLL<Student>();
              studentLL.insertHead(s1);
              studentLL.insertHead(s2);
              studentLL.insertHead(s3);
              studentLL.insertHead(s5);
              studentLL.deleteHead();
       }

       /**
        * Test of deleteTail method, of class StudentLL.
        */
       @Test
       public void testDeleteTail() {
              StudentLL studentLL = new StudentLL<Student>();
              studentLL.insertHead(s1);
              studentLL.insertHead(s2);
              studentLL.insertHead(s3);
              studentLL.insertHead(s5);
              studentLL.deleteTail();
       }

       /**
        * Test of deleteAt method, of class StudentLL.
        */
       @Test
       public void testDeleteAt() {
              StudentLL studentLL = new StudentLL<Student>();
              studentLL.insertHead(s1);
              studentLL.insertHead(s2);
              studentLL.insertHead(s3);
              studentLL.insertHead(s5);
              studentLL.deleteAt(2);
       }

       /**
        * Test of contains method, of class StudentLL.
        */
       @Test
       public void testContains() {
              StudentLL studentLL = new StudentLL<Student>();
              studentLL.insertHead(s1);
              studentLL.insertHead(s2);
              studentLL.insertHead(s3);
              studentLL.insertHead(s5);
              studentLL.contains(s2);
       }

       /**
        * Test of traverse method, of class StudentLL.
        */
       @Test
       public void testTraverse() {
              StudentLL studentLL = new StudentLL<Student>();
              studentLL.insertHead(s1);
              studentLL.insertHead(s2);
              studentLL.insertHead(s3);
              studentLL.insertHead(s5);
              studentLL.traverse();
       }

}
