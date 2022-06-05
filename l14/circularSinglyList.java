package l14;

import java.util.*;

// class for defining all operations in singly linked list
public class circularSinglyList {
    private Node head = null; // head reference of Node type
    private Node tail = null; // tail refere to the

    // To check list is empty or not
    public boolean isEmpty() {
        return (head == null);
    }

    // Add node to circular 1-way linked list
    public void insertNode(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;

        } else {
            tail.next = newNode;

        }
        tail = newNode;
        tail.next = head;
    }

    // Search element in circular 1-way linked list
    public boolean search(int itemSearch) {
        Node cur = head;
        if(isEmpty()){
            return false;
        }

        do {
            if (cur.data == itemSearch) {
                return true;
            }
            cur = cur.next;
        } while (cur != head);
        return false;
    }

    public void deleteNode(int itemDelete) { 
        Node node = head;
        if (isEmpty()) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (node.data == itemDelete) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.data == itemDelete) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }


    // For printing Linked List
    public void displayList() {
        if (isEmpty()) {
            System.out.println("Nothing to display");
            return;
        }
        System.out.print("List is: ");
        Node currentNode = head;
        do {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;

        } while (currentNode != head);
        System.out.println();

    }

    public static void main(String[] args) {
        circularSinglyList list = new circularSinglyList();
        Scanner sc = new Scanner(System.in);
        int op;
        while (true) {
            System.out.print("1.Insertion in circular singly list\n2.Deletion in circular singly list\n3.Search data in circular singly list\n4.Display the list\n5.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int a = sc.nextInt();
                    list.insertNode(a);
                    list.displayList();
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int b = sc.nextInt();
                    list.deleteNode(b);
                    list.displayList();
                    break;
                case 3:
                    System.out.print("Enter data value to search: ");
                    int data = sc.nextInt();
                    if (list.search(data))
                        System.out.println(data + " is searched");
                    else
                        System.out.println(data + " is not searched");
                    break;
                case 4:
                    list.displayList();
                    break;
                case 5:
                    return;

            }
        }
    }
}