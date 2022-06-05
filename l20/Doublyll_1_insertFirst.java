package l20;

import java.util.*;

// Node class to define the structure of the link list
public class Doublyll_1_insertFirst {
    Node head; // head of the doubly list

    // Insertion at the begining
    public void insertFirst(int item) {
        Node node = new Node(item);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    boolean isEmpty() {
        return (head == null);
    }

    // Display function for doubly linked list
    public void displayList(Node trav) {
        if (isEmpty()) {
            System.out.println("List is empty nothing to show");
            return;
        }

        trav = head;
        Node last = null;
        System.out.println("Forward traversal");
        while (trav != null) {
            System.out.print(trav.data + " ");
            last = trav;
            trav = trav.next;
        }
        System.out.println();

        System.out.println("Reverse traversal");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }

    // Main method.

    public static void main(String[] args) {
        // create object of Doublyll, start with empty list
        Doublyll_1_insertFirst dList = new Doublyll_1_insertFirst();
        System.out.print("Implementation of doubly linked list\n");
        Scanner sc = new Scanner(System.in);
        int op, item, position;
        while (true) {
            System.out.print("1.Insert at front\n2.Display the list\n3.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    item = sc.nextInt();
                    dList.insertFirst(item);
                    break;
                case 2:
                    dList.displayList(dList.head);
                    break;
                case 3:
                    return;

            }
        }
    }
}