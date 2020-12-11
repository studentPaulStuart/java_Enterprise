// Assessment Lab 16 - All testing shown in this file for the Student LL and DLL
/* @author Paul Stuart */
package Assessable_Labs_TESTING;

import Session16_AssessLab.CustomList_Student.*;
import Session16_AssessLab. *;

public class AssessmentLabs_16_StudentLL_Testing {

    public static void main(String[] args) {

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

        // Linked List for Student --------------------------------------------
        System.out.println("\n------------------- Linked List Demo Student Class -------------------\n");
        StudentLL studentLL = new StudentLL<Student>();
        studentLL.insertHead(s1);
        studentLL.insertHead(s2);
        studentLL.insertHead(s3);
        studentLL.insertHead(s5);
        System.out.println("\n4 Inserts at Head Position ------------------- \n");
        studentLL.traverse();
        System.out.println("\nInsert at Specific Position ------------------- \n");
        studentLL.insertAt(1, s4);
        studentLL.traverse();
        System.out.println("\n Delete at Specific Position ------------------- \n");
        studentLL.deleteAt(1);
        studentLL.traverse();
        System.out.println("\n Insert at Tail Position ------------------- \n");
        studentLL.insertTail(s6);
        studentLL.traverse();
        System.out.println("\n Delete at Tail Position ------------------- \n");
        studentLL.deleteTail();
        studentLL.traverse();
        System.out.println("\n Search for a Student in List - 'Aaron' = " + (studentLL.contains(s2)));

        // Double Linked List for Student --------------------------------------------
        System.out.println("\n------------------- Double Linked List Demo Student Class -------------------\n");
        StudentDLL studentDLL = new StudentDLL<Student>();
        System.out.println("\n4 Inserts at Head Position DLL Student ------------------- \n");
        studentDLL.addFirst(s3);
        studentDLL.addFirst(s5);
        studentDLL.addFirst(s7);
        System.out.println("\n Add Last DLL Student ------------------- \n");
        studentDLL.addLast(s6);
        studentDLL.printDLLStudent();
        System.out.println("\n Remove FIrst DLL Student ------------------- \n");
        studentDLL.removeFirst();
        studentDLL.printDLLStudent();
        System.out.println("\n Remove Last DLL Student ------------------- \n");
        studentDLL.removeLast();
        studentDLL.printDLLStudent();
        System.out.println("\n Search for a Student in List - 'Stacey' = " + (studentDLL.contains(s3)));

    }

}
