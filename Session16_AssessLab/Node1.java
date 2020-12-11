// Labn 1 session 16
package Session16_AssessLab;

public class Node1<Student> {
       
       public Student value;
       public Node1 next;
       public Node1 previous;
       
       public Node1(Student value)
       {
              this.value = value;
       }

       public Student getValue() {
              return value;
       }

       public void setValue(Student value) {
              this.value = value;
       }

       public Node1 getNext() {
              return next;
       }

       public void setNext(Node1 next) {
              this.next = next;
       }

      
}
