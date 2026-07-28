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

    // Insert at end
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

    // Delete first node
    public void deleteFirst() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        head = head.next;
    }

    // Display
    public void display() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println(" -> null");
    }
}

public class DeleteFirst {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Before Deletion:");
        list.display();

        list.deleteFirst();

        System.out.println("\nAfter Deletion:");
        list.display();
    }
}