// import java.lang.classfile.components.ClassPrinter.Node;

 class Node {
    // public static void main(String[] args) {
        int data ;
        Node next;
public Node(int data){
        this.data = data;
        this.next = null;

    }
}
public class LinkedL{
public static void main(String[] args) {
        // Create the first node (head of the list)
        Node head = new Node(10);

        // Link the second node
        head.next = new Node(20);

        // Link the third node
        head.next.next = new Node(30);

        // Link the fourth node
        head.next.next.next = new Node(40);

        //Printing 
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

  