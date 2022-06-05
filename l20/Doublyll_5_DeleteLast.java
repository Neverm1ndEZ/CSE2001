package l20;

import java.util.*;

public class Doublyll_5_DeleteLast {
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
            System.out.println("Nothing in the list (Underflow)");
            return;

        }

        if (head.next == null) {
            head = head.next;
        } else {
            head = head.next;
            head.prev = null;

        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("Nothing in the list (Underflow)");
            return;
        }

        if (head.next == null) {
            deleteFirst();
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }


    // Display function for doubly linked list
    public void displayList(Node trav) {
        if (isEmpty()) {
            System.out.println("List is empty nothing to show");
            return;
        }
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
        System.out.print("\n");
    }

    // Main method.
    public static void main(String[] args) {
        // create object of Doublyll, start with empty list
        Doublyll_5_DeleteLast dList = new Doublyll_5_DeleteLast();
        System.out.print("Implementation of doubly linked list\n");
        Scanner sc = new Scanner(System.in);
        int op, item, position;
        while (true) {
            System.out.print("1.Insert at front\n2.Deletion at rear\n3.Display the list\n4.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    item = sc.nextInt();
                    dList.insertFirst(item);
                    dList.displayList(dList.head);
                    break;
                case 2:
                    dList.deleteLast();
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