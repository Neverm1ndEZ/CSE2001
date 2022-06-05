package l20;

import java.util.*;

public class Doublyll_4_DeleteFirst {
    Node head; // head of the doubly list
// Insertion at the begining


    public void insertFirst(int item) {
        // allocate memory to node and assign the data
        Node newNode = new Node(item);
        // next of newNode as head and previous as NULL
        newNode.next = head;
        newNode.prev = null;
        // change prev of head node to newNode
        if (head != null)
            head.prev = newNode;
        // head now refer to the newNode */
        head = newNode;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void deleteFirst() {
        if (isEmpty()) {
            return;
        }

        if (head.next == null) {
            head = head.next;
            return;
        }

        head = head.next;
        head.prev = null;
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
        Doublyll_4_DeleteFirst dList = new Doublyll_4_DeleteFirst();
        System.out.print("Implementation of doubly linked list\n");
        Scanner sc = new Scanner(System.in);
        int op, item, position;
        while (true) {
            System.out.print("1.Insert at front\n2.Deletion at front\n3.Display the list\n4.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    item = sc.nextInt();
                    dList.insertFirst(item);
                    break;

                case 2:
                    dList.deleteFirst();
                    dList.displayList(dList.head);
                    break;


                case 3:
                    dList.displayList(dList.head);
                    break;
                case 4:
                    return;

            }

        }

    }
}

