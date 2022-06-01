package l13;

import java.util.*;
public class SinglyList_2 {

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

    // Deletion at the end
    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        if (temp.next == null) {
            head = null;
            return;
        }
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    // For printing Linked List
    public void displayList() {
        if (isEmpty()) {
            System.out.print("Nothing to display\n");
            return;
        } else {
            Node cur = head;
            System.out.print("List is: ");
            while (cur != null) {
                System.out.print(cur.data + "-->");
                cur = cur.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyList_2 list = new SinglyList_2();
        Scanner sc = new Scanner(System.in);
        int op, x;
        while (true) {
            System.out.print("1.Insert at front\n2.Deletion at last\n3.Display\n4.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    int a = sc.nextInt();
                    list.insertFirst(a);
                    list.displayList();
                    break;
                case 2:
                    list.deleteLast();
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