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
public class StudentDLLTest {

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

       public StudentDLLTest() {

       }

       /**
        * Test of addFirst method, of class StudentDLL.
        */
       @Test
       public void testAddFirst() {
              StudentDLL studentDLL = new StudentDLL<Student>();
              studentDLL.addFirst(s1);

       }

       /**
        * Test of addLast method, of class StudentDLL.
        */
       @Test
       public void testAddLast() {
              StudentDLL studentDLL = new StudentDLL<Student>();
              studentDLL.addLast(s2);

       }

       /**
        * Test of removeFirst method, of class StudentDLL.
        */
       @Test
       public void testRemoveFirst() {
              StudentDLL studentDLL = new StudentDLL<Student>();
              studentDLL.addFirst(s1);
              studentDLL.addLast(s2);
              studentDLL.removeFirst();

       }

       /**
        * Test of removeLast method, of class StudentDLL.
        */
       @Test
       public void testRemoveLast() {
              StudentDLL studentDLL = new StudentDLL<Student>();
              studentDLL.addFirst(s1);
              studentDLL.addLast(s2);
              studentDLL.removeLast();

       }

       /**
        * Test of contains method, of class StudentDLL.
        */
       @Test
       public void testContains() {
              StudentDLL studentDLL = new StudentDLL<Student>();
              studentDLL.addFirst(s1);
              studentDLL.addLast(s2);
              studentDLL.contains(s1);
       }

       /**
        * Test of printDLLStudent method, of class StudentDLL.
        */
       @Test
       public void testPrintDLLStudent() {
              StudentDLL studentDLL = new StudentDLL<Student>();
              studentDLL.addFirst(s1);
              studentDLL.addLast(s2);
              studentDLL.printDLLStudent();
       }

}
