/// This is a custom Node Developed for the Enrollment Linked and Double Linked Classes
// It is designed for the Linked Listto Accept Data Object Enrollment Specifically
// @author Paul Stuart
package Session16_AssessLab.CustomList_Enrollment;

public class EnrollmentNode<Enrollment> {
       
       private Enrollment enrollmentData;
       private EnrollmentNode prev;
       private EnrollmentNode next;

       public EnrollmentNode(Enrollment enrollmentData) {
              this.enrollmentData = enrollmentData;
       }

       public Enrollment getEnrollmentData() {
              return enrollmentData;
       }

       public void setEnrollmentData(Enrollment enrollmentData) {
              this.enrollmentData = enrollmentData;
       }

       public EnrollmentNode getPrev() {
              return prev;
       }

       public void setPrev(EnrollmentNode prev) {
              this.prev = prev;
       }

       public EnrollmentNode getNext() {
              return next;
       }

       public void setNext(EnrollmentNode next) {
              this.next = next;
       }
       
       
       
       
}
