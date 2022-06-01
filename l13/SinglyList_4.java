package l13;

import java.util.*;

public class SinglyList_4 {
    private Node head; // head reference of Node type

    // To check list is empty or not
    public boolean isEmpty() {
        // Complete this function
        return (head == null);
    }

    // used to insert a node at the start of linked list
    public void insertFirst(int data) {
        // Complete this function
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // used to insert a node at the start of linked list
    public void insertLast(int data) {
        // Complete this function
        if (isEmpty()) {
            insertFirst(data);
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        Node node = new Node();
        node.data = data;
        cur.next = node;
    }

    // insertion after a given node by data
    public void insertAfterData(int dataAfter, int item) {
        // Complete this function
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        Node node = new Node();
        while (temp.next != null && temp.data != dataAfter) {
            temp = temp.next;
        }
        if (temp.next != null) {
            node.data = item;
            node.next = temp.next;
            temp.next = node;
        } else if (temp.data != dataAfter) {
            System.out.println("Node is not present in the list");
        } else {
            node.data = item;
            node.next = null;
            temp.next = node;
        }
    }

    // Deletion at the front
    public void deleteFirst() {
        // Complete this function
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        head = head.next;
        System.out.println("Data deleted is: " + temp.data);
    }

    // Deletion at the end
    public void deleteLast() {
        // Complete this function
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        Node prev = null;
        if (temp.next == null) {
            head = null;
            return;
        }

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    // Deletion after a given node postion
    public void deleteAfterData(int data) {
        // Complete this function
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.data != data) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        } else if (temp.data != data) {
            System.out.println("Node is not present");
        } else {
            System.out.println("Deletion not possible this the last node");
        }
    }


    // For printing Linked List
    public void displayList() {
        // Complete this function
        if (isEmpty()) {
            System.out.println("Nothing to display");
        } else {
            Node cur = head;
            System.out.println("List is:");
            while (cur != null) {
                System.out.print(cur.data + "-->");
                cur = cur.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyList_4 list = new SinglyList_4();
        Scanner sc = new Scanner(System.in);
        int op, item;
        System.out.println("Implementation of singly linked list");
        while (true) {
            System.out.print("1.Insertion at the beginning\n2.Insertion at the end\n3.Insertion after given node(data)\n4.Deletion at the beginning\n5.Deletion at the end\n6.Deletion after a given node(data)\n7.Display list\n8.Exit\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter values: ");
                    item = sc.nextInt();
                    list.insertFirst(item);
                    list.displayList();
                    break;
                case 2:
                    System.out.print("Enter values: ");
                    item = sc.nextInt();
                    list.insertLast(item);
                    list.displayList();
                    break;
                case 3:
                    System.out.print("Enter data after which you want to insert node: ");
                    int dataAfter = sc.nextInt();
                    System.out.print("Enter the value to insert: ");
                    item = sc.nextInt();
                    list.insertAfterData(dataAfter, item);
                    list.displayList();
                    break;
                case 4:
                    list.deleteFirst();
                    list.displayList();
                    break;
                case 5:
                    list.deleteLast();
                    list.displayList();
                    break;
                case 6:
                    System.out.print("Enter data after which you want to do deletion: ");
                    item = sc.nextInt();
                    list.deleteAfterData(item);
                    list.displayList();
                    break;
                case 7:
                    list.displayList();
                    break;
                case 8:
                    System.exit(1);
            }
        }
    }
}