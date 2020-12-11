/// This is a custom Double Linked List for the Student Class, it allows complete Objects to be parsed into
// the list and then for various shifting, removing and traversing
// @author Paul Stuart
package Session16_AssessLab.CustomList_Student;

public class StudentDLL<Student> {

    StudentNode<Student> head;
    StudentNode<Student> tail;
    int count = 0;

    // Adds the Student Object Node as the Head of the List, utilise temp Obj variable and switch head/tail. The list
    // is tracked using a counter to know where to se the Node based on how many in the List
    public void addFirst(Student data) {
        StudentNode<Student> nodeInsert = new StudentNode(data);
        if (head == null) {
            tail = nodeInsert;
        } else {
            head.setPrev(nodeInsert);
        }
        nodeInsert.setNext(head);
        head = nodeInsert;
        count++;
    }

    // Add Last, as before but instead of the Head, inserting at the tail
    public void addLast(Student data) {
        StudentNode<Student> nodeInsert = new StudentNode(data);
        if (count == 0) {
            head = nodeInsert;
        } else {
            tail.setNext(nodeInsert);
            nodeInsert.setPrev(tail);
        }
        tail = nodeInsert;
        count++;
    }

    // Removes the head Node of the Student List, shuffles the other Nodes up +1 position
    public void removeFirst() {
        if (count != 0) {
            head = head.getNext();
            count--;
            if (count == 0) {
                tail = null;
            } else {
                head.setPrev(null);
            }
        }
    }

    // As above but for the tail Node on the List, all other items remain in position
    public void removeLast() {
        if (count != 0) {
            if (count == 1) {
                head = null;
                tail = null;
            } else {
                tail.getPrev().setNext(null);
                tail = tail.getPrev();
            }
            count--;
        }
    }

    // Search for a Student Object in the Linked List, requires an Obj to be parsed
    public boolean contains(Student item) {
        StudentNode<Student> current = head;
        while (current != null) {
            if (current.getStudentData().equals(item)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    // print out the current Student Object Linked List
    public void printDLLStudent() {
        StringBuilder result = new StringBuilder("\n[");
        StudentNode temp = head;
        while (temp.getNext() != null) {
            result.append(temp.getStudentData() + ",\n\n");
            temp = temp.getNext();
        }
        result.append(temp.getStudentData() + "]\n");
        System.out.println(result.toString());
    }

}
