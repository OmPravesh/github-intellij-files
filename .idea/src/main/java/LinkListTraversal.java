public class LinkListTraversal {

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the list

    // Insert at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at the beginning
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at a specific index (0-based)
    public void insertAt(int index, int data) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative: " + index);
        }

        if (index == 0) {
            insertBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Traverse and print the linked list
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        LinkListTraversal list = new LinkListTraversal();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertBeginning(5);    // 5 -> 10 -> 20 -> 30
        list.insertAt(2, 15);       // 5 -> 10 -> 15 -> 20 -> 30

        System.out.println("Linked List elements:");
        list.traverse();
    }
}
