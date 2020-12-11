// Lab 1 
package Session16_AssessLab;


public class Lab01 {
       
       public static void main(String[] args) {
              Node1 first = new Node1(3);
              Node1 middle = new Node1(5);
              first.setNext(middle);
              Node1 last = new Node1(7);
              middle.setNext(last);
              printList(first);
       }

       private static void printList(Node1 node) {
              
             while(node != null)
             {
                    System.out.println(node.getValue());
                    node = node.getNext();
             }
       }
       
}
