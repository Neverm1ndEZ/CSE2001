package l20;

import java.util.*;

public class Doublyll_3_insertAtPos {
    Node head; // head of the doubly list
    // Insertion at the begining

    public void insertFirst(int item) {
        // allocate memory to node and assign the data
        Node newNode = new Node(item);
        // next of newNode as head and previous as NULL
        newNode.next = head;
        newNode.prev = null;
        // change prev of head node to newNode
        if (head != null) head.prev = newNode;
        // head now refer to the newNode */
        head = newNode;
    }

    // Insertion  at the end of the list
    public void insertLast(int item) {
        // allocate memory to node and assign the data
        Node newNode = new Node(item);
        Node last = head; // to be used at end for insertion at the end
        // new node is going to be the last node, so its next became null
        newNode.next = null;
        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        // Otherwise traverse till the last node
        while (last.next != null) last = last.next;
        //Change the next of last node
        last.next = newNode;
        // Now last node as previous of newNode
        newNode.prev = last;
    }

    // Utility fucntion to calculate the size of the list
    public int listSize() {
        Node trav = head;
        int size = 0;
        while (trav != null) {
            size++;
            trav = trav.next;
        }
        return size;
    }

    // Function to insert node at given position ( first node is at position 1)
    public void insertAtPosition(int data, int pos) {
        int size = listSize();
        if (pos > 0 && pos <= size) {
            Node node = new Node(data);
            Node cur = head;
            if (pos == 1) {
                insertFirst(data);
            } else if (pos == size) {
                insertLast(data);
            } else {
                for (int i = 1; i < pos && cur.next != null; i++) {
                    cur = cur.next;
                    node.next = cur;
                    cur.prev.next = node;
                    node.prev = cur.prev;
                    cur.prev = node;
                }
            }
        } else {
            System.out.println("Position " + pos + " not valid for linked list with size " + size);
        }
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
        Doublyll_3_insertAtPos dList = new Doublyll_3_insertAtPos();
        System.out.print("Implementation of doubly linked list\n");
        Scanner sc = new Scanner(System.in);
        int op, item, position;
        while (true) {
            System.out.print("1.Insert at front\n2.Insert at last\n3.Insert at given position\n4.Display the list\n5.Exit\n");
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
                    System.out.print("Enter value: ");
                    item = sc.nextInt();
                    dList.insertLast(item);
                    dList.displayList(dList.head);
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    position = sc.nextInt();
                    System.out.print("Enter value: ");
                    item = sc.nextInt();
                    dList.insertAtPosition(item, position);
                    dList.displayList(dList.head);
                    break;
                case 4:
                    dList.displayList(dList.head);
                    break;
                case 5:
                    return;
            }
        }
    }
}