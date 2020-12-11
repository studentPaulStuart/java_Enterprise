/// This is a custom Linked List for the Enrollment Class, it allows complete Objects to be parsed into
// the list and then for various shifting, removing and traversing
// @author Paul Stuart
package Session16_AssessLab.CustomList_Enrollment;

public class EnrollmentLL<Enrollment> {

       private EnrollmentNode<Enrollment> head;
       private EnrollmentNode<Enrollment> tail;

       // Inserts the first Enrollment Obj on the list, pushes the others down by 1 position
       public void insertHead(Enrollment data) {
              EnrollmentNode<Enrollment> nodeInsert = new EnrollmentNode(data);
              if (head == null) {
                     tail = nodeInsert;
              } else {
                     head.setPrev(nodeInsert);
              }
              nodeInsert.setNext(head);
              head = nodeInsert;
       }

       // Inserts at the end of the List, keeps everything as. Increase list by +1
       public void insertTail(Enrollment data) {
              EnrollmentNode<Enrollment> nodeInsert = new EnrollmentNode(data);
              tail.setNext(nodeInsert);
              nodeInsert.setPrev(tail);
              this.tail = nodeInsert;
       }

       // Allows a specific postion for the node to be inserted in the list, the method requires an int for the position and the Student Obj
       public void insertAt(int position, Enrollment data) {
              EnrollmentNode<Enrollment> nodeInsert = new EnrollmentNode(data);
              EnrollmentNode<Enrollment> temp = head;
              for (int i = 0; i < position; i++) {
                     temp = temp.getNext();
              }
              nodeInsert.setPrev(temp);
              nodeInsert.setNext(temp.getNext());
              temp.setNext(nodeInsert);
              nodeInsert.getNext().setPrev(nodeInsert);
       }

       // Removes off the first element of the Student List, shifts everything up +1 position
       public void deleteHead() {
              EnrollmentNode<Enrollment> temp = head;
              this.head = temp.getNext();
              this.head.setPrev(null);
       }

       // Removes off the last element of the list
       public void deleteTail() {
              EnrollmentNode<Enrollment> previous = tail.getPrev();
              previous.setNext(null);
              this.tail = previous;
       }

       // Remove a node at a specific position by parsing an int value
       public void deleteAt(int position) {
              EnrollmentNode<Enrollment> temp = head;
              for (int i = 0; i < position; i++) {
                     temp = temp.getNext();
              }
              temp.getPrev().setNext(temp.getNext());
              temp.getNext().setPrev(temp.getPrev());
       }

       // Contains function is another checking function to search the list for a Student Object, it iterates the list returning a boolean
       public boolean contains(Enrollment item) {
              EnrollmentNode<Enrollment> current = head;
              while (current != null) {
                     if (current.getEnrollmentData().equals(item)) {
                            return true;
                     }
                     current = current.getNext();
              }
              return false;
       }

       // This function is for outputting the List after one of the other functions has made an ammendment to the list
       public void traverse() {
              StringBuilder result = new StringBuilder("[");
              EnrollmentNode temp = head;
              while (temp.getNext() != null) {
                     result.append(temp.getEnrollmentData() + ", \n ");
                     temp = temp.getNext();
              }
              result.append(temp.getEnrollmentData() + "]");
              System.out.println(result.toString());
       }

       

}
