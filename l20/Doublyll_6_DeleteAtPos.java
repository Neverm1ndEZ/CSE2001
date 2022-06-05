package l20;

import java.util.*;

public class Doublyll_6_DeleteAtPos {
    Node head; // head of the doubly list

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
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }

    public int listSize() {
        Node trav = head;
        int size = 0;
        while (trav != null) {
            size++;
            trav = trav.next;
        }
        return size;
    }

    public void deleteAtPosition(int pos) {
        if (isEmpty()) {
            System.out.println("Nothing in the list (Underflow)");
            return;
        }
        int size = listSize();
        if (pos > 0 && pos <= size) {
            Node cur = head;
            if (pos == 1) {
                deleteFirst();
            } else if (pos == size) {
                deleteLast();
            } else {
                for (int i = 1; i < pos && cur.next != null; i++) {
                    cur = cur.next;
                }
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
            }
        } else {
            System.out.println("Index " + pos + " is not valid in the linked list of size " + size);
        }
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
        Doublyll_6_DeleteAtPos dList = new Doublyll_6_DeleteAtPos();
        System.out.print("Implementation of doubly linked list\n");
        Scanner sc = new Scanner(System.in);
        int op, item, position;
        while (true) {
            System.out.print("1.Insert at front\n2.Deletion at given position\n3.Display the list\n4.Exit\n");
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
                    System.out.print("Enter position: ");
                    position = sc.nextInt();
                    dList.deleteAtPosition(position);
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