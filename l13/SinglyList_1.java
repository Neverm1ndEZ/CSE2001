package l13;
import java.util.*;

// Node class define the structure of the node
public class SinglyList_1 {
    private Node head; // head reference of Node type
    // To check list is empty or not
    public boolean isEmpty() {
        return (head == null);
    }
    // used to insert a node at the start of linked list
    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // Deletion at the front
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        head = head.next;
        System.out.println("Data deleted is: " + temp.data);
    }


    // For printing Linked List
    public void displayList() {
        if (isEmpty()) {
            System.out.println("Nothing to display");
            return;
        }
        Node cur = head;
        System.out.print("List is: ");
        while (cur != null) {
            System.out.print(cur.data + "-->");
            cur = cur.next;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        SinglyList_1 list = new SinglyList_1();
        Scanner sc = new Scanner(System.in);
        int op, x;
        while (true) {
            System.out.print("1.Insert at front\n2.Deletion at first\n3.Display\n4.Exit\n");
            System.out.print("Enter your option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    int a = sc.nextInt();
                    list.insertFirst(a);
                    break;
                case 2:
                    list.deleteFirst();
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