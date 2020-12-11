/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session15_AssessLab;

import org.junit.Test;

/**
 *
 * @author pauls
 */
public class StudentTest {

       Person p1 = new Person("James", "jim@gmail.com", "458719974");
       Person p2 = new Person("Aaron", "aaron@gmail.com", "12368496");
       Person p3 = new Person("Stacey", "stacey@gmail.com", "45689248");
       Person p4 = new Person("Seth", "seth@gmail.com", "04256897");
       Person p5 = new Person("Jake", "jake@gmail.com", "04568125");
       Person p6 = new Person("Alison", "alsion@gmail.com", "043219875");
       Person p7 = new Person("Bridgette", "bridgette@gmail.com", "04125896");
       Person p8 = new Person("Jack", "jack@gmail.com", "0412589659");

       Student s1 = new Student(123, "01-02-2020", "English", p1);
       Student s2 = new Student(568, "04-02-2020", "English", p2);
       Student s3 = new Student(731, "02-02-2020", "Sports", p3);
       Student s4 = new Student(197, "07-02-2020", "Sports", p4);
       Student s5 = new Student(845, "01-02-2020", "Maths", p5);
       Student s6 = new Student(962, "31-12-2019", "Chemistry", p6);
       Student s7 = new Student(458, "04-02-2020", "Physics", p7);
       Student s8 = new Student(159, "05-02-2020", "Sports", p8);

       Student[] studentList = {s1, s2, s3, s4, s5, s6, s7, s8};

       public StudentTest() {
       }

       /**
        * Test of LinearSearchOfStudent method, of class Student.
        */
       @Test
       public void testLinearSearchOfStudent() {
              s1.LinearSearchOfStudent(studentList, s1);
       }

       /**
        * Test of BinarySearchOfStudent method, of class Student.
        */
       @Test
       public void testBinarySearchOfStudent() throws Exception {
              s1.BinarySearchOfStudent(studentList, s1);
       }

       /**
        * Test of BubbleSortOfStudent method, of class Student.
        */
       @Test
       public void testBubbleSortOfStudent() throws Exception {
              s1.BubbleSortOfStudent(studentList);
       }

       /**
        * Test of insertionSortStudent method, of class Student.
        */
       @Test
       public void testInsertionSortStudent() {
              s1.insertionSortStudent(studentList);
       }

       /**
        * Test of getDateRegistered method, of class Student.
        */
       @Test
       public void testGetDateRegistered() {
              s1.getDateRegistered();
       }

       /**
        * Test of setDateRegistered method, of class Student.
        */
       @Test
       public void testSetDateRegistered() {
              s2.setDateRegistered("02-02-2021");
       }

       /**
        * Test of get program method, of class Student.
        */
       @Test
       public void testGetprogram() {
              s3.getprogram();
       }

       /**
        * Test of set program method, of class Student.
        */
       @Test
       public void testSetprogram() {
              s4.setprogram("Sports Science");
       }

       /**
        * Test of getId method, of class Student.
        */
       @Test
       public void testGetId() {
              s4.getId();
       }

       /**
        * Test of setId method, of class Student.
        */
       @Test
       public void testSetId() {
              s4.setId(1256);
       }

       /**
        * Test of getPerson method, of class Student.
        */
       @Test
       public void testGetPerson() {
              s5.getPerson();
       }

       /**
        * Test of setPerson method, of class Student.
        */
       @Test
       public void testSetPerson() {
              s6.setPerson(p3);
       }

       /**
        * Test of hashCode method, of class Student.
        */
       @Test
       public void testHashCode() {
              s6.hashCode();
       }

       /**
        * Test of equals method, of class Student.
        */
       @Test
       public void testEquals() {
              s6.equals(s4);
       }

       /**
        * Test of toString method, of class Student.
        */
       @Test
       public void testToString() {
              s6.toString();
       }

       /**
        * Test of compareTo method, of class Student.
        */
       @Test
       public void testCompareTo() {
              s7.compareTo(s8);
       }

       /**
        * Test of compareToID_Name method, of class Student.
        */
       @Test
       public void testCompareToID_Name() throws Exception {
              s5.compareToID_Name(s1);
       }

}
