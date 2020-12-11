/// This is a custom Node Developed for the Student Linked and Double Linked Classes
// It is designed for the Linked Listto Accept Data Object Student Specifically
// @author Paul Stuart
package Session16_AssessLab.CustomList_Student;

import Session16_AssessLab.Student;


public class StudentNode<Student> {

    private Student studentData;
    private StudentNode prev;
    private StudentNode next;

    public Student getStudentData() {
        return studentData;
    }

    public void setStudentData(Student studentData) {
        this.studentData = studentData;
    }

    public StudentNode getPrev() {
        return prev;
    }

    public void setPrev(StudentNode prev) {
        this.prev = prev;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    public StudentNode(Student studentData) {
        this.studentData = studentData;
    }

}
