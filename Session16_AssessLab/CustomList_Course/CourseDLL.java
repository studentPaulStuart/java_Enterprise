/// This is a custom Linked List for the Student Class, it allows complete Objects to be parsed into
// the list and then for various shifting, removing and traversing
// @author Paul Stuart
package Session16_AssessLab.CustomList_Course;

public class CourseDLL<Course> {

    CourseNode<Course> head;
    CourseNode<Course> tail;
    int count = 0;

    // Adds the Student Object Node as the Head of the List, utilise temp Obj variable and switch head/tail. The list
    // is tracked using a counter to know where to se the Node based on how many in the List
    public void addFirst(Course data) {
        CourseNode<Course> nodeInsert = new CourseNode(data);
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
    public void addLast(Course data) {
        CourseNode<Course> nodeInsert = new CourseNode(data);
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
    public boolean contains(Course item) {
        CourseNode<Course> current = head;
        while (current != null) {
            if (current.getCourseData().equals(item)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    // print out the current Student Object Linked List
    public void printDLLStudent() {
        StringBuilder result = new StringBuilder("[");
        CourseNode temp = head;
        while (temp.getNext() != null) {
            result.append(temp.getCourseData() + ", \n");
            temp = temp.getNext();
        }
        result.append(temp.getCourseData() + "]");
        System.out.println(result.toString());
    }

}
