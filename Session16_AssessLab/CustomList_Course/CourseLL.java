/// This is a custom Linked List for the Course Class, it allows complete Objects to be parsed into
// the list and then for various shifting, removing and traversing
// @author Paul Stuart
package Session16_AssessLab.CustomList_Course;

public class CourseLL<Course> {

    private CourseNode<Course> head;
    private CourseNode<Course> tail;

    // Inserts the first Student Object on the list and bumps everything else down 1 position
    public void insertHead(Course data) {
        CourseNode<Course> nodeInsert = new CourseNode(data);
        if (head == null) {
            tail = nodeInsert;
        } else {
            head.setPrev(nodeInsert);
        }
        nodeInsert.setNext(head);
        head = nodeInsert;
    }

    // Inserts at the end of the List, keeps everything as. Increase list by +1
    public void insertTail(Course data) {
        CourseNode<Course> nodeInsert = new CourseNode(data);
        tail.setNext(nodeInsert);
        nodeInsert.setPrev(tail);
        this.tail = nodeInsert;
    }

    // Allows a specific postion for the node to be inserted in the list, the method requires an int for the position and the Student Obj
    public void insertAt(int position, Course data) {
        CourseNode<Course> nodeInsert = new CourseNode(data);
        CourseNode<Course> temp = head;
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
        CourseNode<Course> temp = head;
        this.head = temp.getNext();
        this.head.setPrev(null);
    }

    // Removes off the last element of the list
    public void deleteTail() {
        CourseNode<Course> previous = tail.getPrev();
        previous.setNext(null);
        this.tail = previous;
    }

    // Remove a node at a specific position by parsing an int value
    public void deleteAt(int position) {
        CourseNode<Course> temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
        }
        temp.getPrev().setNext(temp.getNext());
        temp.getNext().setPrev(temp.getPrev());

    }

    // Contains function is another checking function to search the list for a Student Object, it iterates the list returning a boolean
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

    // This function is for outputting the List after one of the other functions has made an ammendment to the list
    public void traverse() {
        StringBuilder result = new StringBuilder("[");
        CourseNode temp = head;
        while (temp.getNext() != null) {
            result.append(temp.getCourseData() + "\n");
            temp = temp.getNext();
        }
        result.append(temp.getCourseData() + "]");
        System.out.println(result.toString());
    }

}
