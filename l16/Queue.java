package l16;

import java.util.*;

public class Queue {
    private Node front, rear;
    private int size; // Number of elements
    //Default  constructor to initialize front, rear and currentSize
    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    //Dequeue from the front.
    public void dequeue() {
        /* Write code for required functionality here */
        if(isEmpty()){
            System.out.println("Queue is empty deletion not possible");
            rear = null;
        } else {
            int data = front.data;
            front = front.next;
            System.out.println(data+" deleted from the queue");
        }
    }

    //Enqueue operation at the rear end.
    public void enqueue(int data) {
        /* Write code for required functionality here */
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if(isEmpty()){
            front = rear;
        } else {
            oldRear.next = rear;
        }
        System.out.println(data+" added to the queue");
    }

    public void queueSize() {
        /* Write code for required functionality here */
        int size = 0;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node cur = front;
        while(cur != rear){
            size++;
            cur = cur.next;
        }
        size++;
        System.out.println("Current size of queue is: "+size);
    }

    public void display() {
        /* Write code for required functionality here */
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node cur = front;
        System.out.print("Queue is: ");
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    // Driver main method
    public static void main(String a[]) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        int op, item;
        System.out.println("Queue using link list");
        while (true) {
            System.out.print("1.Enqueue operation\n2.Dequeue operation\n3.Current size of queue\n4.Display queue\n5.Exit\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    item = sc.nextInt();
                    queue.enqueue(item);
                    queue.display();
                    break;
                case 2:
                    queue.dequeue();
                    queue.display();
                    break;
                case 3:
                    queue.queueSize();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.exit(1);

            }
        }
    }
}