package l12;

import java.util.*;
// class node is defining the structure of the node
// class for defining all operations in singly linked list
public class SinglyList_3 {
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

    // insertion after a given node by data
    public void insertAfterData(int dataAfter, int item) {
        // write your code here
        if (isEmpty()) {
            System.out.println("List is empty insertion not possible");
            return;
        }
        //Insertion
        Node temp = head;
        Node node = new Node();
        while(temp.next != null && temp.data != dataAfter) {
            temp = temp.next;
        }
            if(temp.next != null){
                node.data = item;
                node.next = temp.next;
                temp.next = node;
            }
            else if (temp.data != dataAfter){
                System.out.println("Node is not present in the list");
            }
            else{
                node.data = item;
                node.next = null;
                temp.next = node;
            }
    }
    // For printing Linked List
    public void displayList() {
        // write your code here
        if(isEmpty()){
            System.out.println("Nothing to display");
            return;
        }

        Node cur = head;
        System.out.print("list is: ");
        while (cur != null){
            System.out.print(cur.data+"-->");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyList_3 list = new SinglyList_3();
        Scanner sc = new Scanner(System.in);
        int op, x;
        while (true) {
            System.out.print("1.Insert at first\n2.Insert after given value\n3.Display\n4.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {

                case 1:
                    System.out.print("Enter value: ");
                    int a = sc.nextInt();
                    list.insertFirst(a);
                    break;
                case 2:
                    System.out.print("Enter data value where you want to insert after: ");
                    int data = sc.nextInt();
                    System.out.print("Enter the value to inserted: ");
                    int value = sc.nextInt();
                    list.insertAfterData(data, value);
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