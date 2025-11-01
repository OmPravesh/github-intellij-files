// Node class
class Node {
    int data;       // Data part
    Node next;      // Reference to next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
public class LinkedListExample {
    Node head;   // Head of the list

    // Method to add a new node at the end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // first node becomes head
        } else {
            Node current = head;
            while (current.next != null) { // traverse till last node
                current = current.next;
            }
            current.next = newNode; // add at the end
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> null
    }
}
