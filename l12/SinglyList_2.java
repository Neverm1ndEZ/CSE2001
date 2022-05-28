package l12;

import java.util.*;

// class node is defining the structure of the node
// class for defining all operations in singly linked list
public class SinglyList_2 {
    private Node head; // head reference of Node type
    // To check list is empty or not
    public boolean isEmpty() {
        return (head == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    // used to insert a node at the start of linked list
    public void insertLast(int data) {
        // write your code here
        if (isEmpty()) {
            head = null;
            insertFirst(data);
            return;
        }
        Node cur = head;
        while(cur.next != null) {
           //cur = node;
            cur = cur.next;
        }
            Node node = new Node();
            node.data = data;
            cur.next = node;
    }
    // insertion after a given node by data
    // For printing Linked List
    public void displayList() {
        // write your code here
        if (isEmpty()) {
            System.out.println("Nothing to display");
            return;
        }
        Node temp = head;
        System.out.print("List is: ");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyList_2 list = new SinglyList_2();
        Scanner sc = new Scanner(System.in);
        int op, x;
        while (true) {
            System.out.print("1.Insert at last\n2.Display\n3.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    int b = sc.nextInt();
                    list.insertLast(b);
                    break;
                case 2:
                    list.displayList();
                    break;
                case 3:
                    return;

            }
        }
    }
}