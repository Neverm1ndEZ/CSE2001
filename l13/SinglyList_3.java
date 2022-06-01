package l13;

import java.util.*;

public class SinglyList_3 {

    private Node head; // head reference of Node type

    // To check list is empty or not
    public boolean isEmpty() {
        return (head == null);
    }

    // used to insert a node at the start of linked list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }


    public void deleteAfterData(int data) {
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
            System.out.println("Node is not present in the list");
        } else {
            System.out.println("Deletion not possible this the last node");
        }
    }

    // For printing Linked List
    public void displayList() {
        if (isEmpty()) {
            System.out.println("nothing to display");
            return;
        }
        System.out.print("List is: ");
        for (Node current = head; current != null; current = current.next) {
            System.out.print(current.data + "-->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyList_3 list = new SinglyList_3();
        Scanner sc = new Scanner(System.in);
        int op, x;
        while (true) {
            System.out.print("1.Insert at front\n2.Deletion of node after given value\n3.Display\n4.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    int a = sc.nextInt();
                    list.insertFirst(a);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    int c = sc.nextInt();
                    list.deleteAfterData(c);
                    System.out.println("Deletion after given value: ");
                    list.displayList();
                    break;
                case 3:
                    list.displayList();
                    break;
                case 4:
                    return;
            }
        }
    }
}