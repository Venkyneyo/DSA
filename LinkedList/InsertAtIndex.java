class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    private Node head;

    // Insert at end (to create the initial list)
    public void insertAtEnd(int data) {

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

    // Insert at a specific index
    public void insertAtIndex(int index, int data) {

        if (index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {

            if (temp == null) {
                System.out.println("Invalid Index");
                return;
            }

            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Index");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display the list
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println(" -> null");
    }
}

public class InsertAtIndex {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.println("Before Insertion:");
        list.display();

        list.insertAtIndex(2, 30);

        System.out.println("\nAfter Insertion:");
        list.display();
    }
}