package l12;

import java.util.*;

// class for defining all operations in singly linked list
public class SinglyList_1 {
    private Node head; // head reference of Node type

    // To check list is empty or not
    public boolean isEmpty() {
        return (head == null);
    }

    // used to insert a node at the start of linked list
    public void insertFirst(int data) {
        // write your code here
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    // used to insert a node at the start of linked list
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
        SinglyList_1 list = new SinglyList_1();
        Scanner sc = new Scanner(System.in);
        int op, x;
        while (true) {
            System.out.print("1.Insert at front\n2.Display\n3.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    int a = sc.nextInt();
                    list.insertFirst(a);
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