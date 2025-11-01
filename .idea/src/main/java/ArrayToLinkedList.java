public class ArrayToLinkedList {
    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of linked list
    private Node head;

    // Convert array to linked list
    public void arrayToList(int[] arr) {
        if (arr.length == 0) {
            return; // empty array
        }

        // First element becomes head
        head = new Node(arr[0]);
        Node current = head;

        // Insert rest of the elements
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
    }

    // Traverse and print
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main to test
    public static void main(String[] args) {
        ArrayToLinkedList list = new ArrayToLinkedList();

        int[] arr = {10, 20, 30, 40, 50};

        list.arrayToList(arr);
        System.out.println("Linked List after converting from array:");
        list.traverse();
    }
}

