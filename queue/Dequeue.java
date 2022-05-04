package queue;

import java.util.Scanner;

public class Dequeue {
    int size;
    int[] array;
    int front;
    int rear;

    public Dequeue(int capacity) {
        this.size = capacity;
        array = new int[size];
        front = -1;
        rear = -1;
    }

    // Functionality to check dequeue is full or not
    boolean isFull() { return ((front == 0 && rear == size - 1) || (front == rear + 1)); }

    // To check dequeue is empty or not
    boolean isEmpty() { return (front == -1 && rear == -1); }

    // Insertion at front
    void insertFront(int item) {
        if (isFull()) { System.out.println("Dequeue Overflow"); return; }
        else if (front == -1) { front = 0; rear = 0; }
        else if (front == 0) { front = size - 1; }
        else { front--; }
        array[front] = item;
    }

    // Insertion at rear end of the dequeue.
    void insertRear(int item) {
        if (isFull()) { System.out.println("Dequeue Overflow"); return; }
        else if (front == -1) { front = 0; rear = 0; }
        else if (rear == size - 1) { rear = 0; }
        else { rear++; }
        array[rear] = item;
    }

    // Deletion at front end of Dequeue
    void deleteFront() {
        if (isEmpty()) { System.out.println("Dequeue Underflow"); return; }
        int val = array[front];
        if (front == rear) { front = -1; rear = -1; }
        else {
            if (front == size - 1) { front = 0; }
            else { front += 1; }
        }
        System.out.println("Element deleted from front is: " + val);
    }

    // Deletion at rear end
    void deleteRear() {
        if (isEmpty()) { System.out.println("Dequeue Underflow"); return; }
        int val = array[rear];
        if (rear == front) { rear = -1; front = -1; }
        else if (rear == 0) { rear = size - 1; }
        else { rear -= 1; }
        System.out.println("Element deleted from rear is: " + val);
    }

    // get front from deueue
    void getFront() {
        if (isEmpty()) { System.out.println("Dequeue is Underflow"); }
        else { System.out.println("Element at front is: " + array[front]); }
    }

    // Get rear of dequeue
    void getRear() {
        if (isEmpty()) { System.out.println("Dequeue is Underflow"); }
        else { System.out.println("Element at rear is: " + array[rear]); }
    }

    public void display() {
        if (isEmpty()) { System.out.println("Queue is Empty"); return; }
        else {
            if (rear >= front) {
                for (int i = front; i <= rear; i++) { System.out.print(array[i] + " "); }
            } else {
                for (int i = front; i < size; i++) { System.out.print(array[i] + " "); }
                for (int i = 0; i <= rear; i++) { System.out.print(array[i] + " "); }
            }
        }
        System.out.println();
    }

    // Driver main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dequeue Implementation using circular fixed size array");
        System.out.print("Enter the size of Dequeue: ");
        int capacity = sc.nextInt();
        int item;
        Dequeue dequeue = new Dequeue(capacity);
        System.out.println("Enter 1 to Insert at front\nEnter 2 to insert at rear\nEnter 3 delete at front\nEnter 4 to delete at rear\nEnter 5 to get front element\nEnter 6 to get rear element\nEnter 7 to display Dequeue\nEnter 8 to exit");
        while (true) {
            System.out.print("Enter your option: ");
            int choice = sc.nextInt();
            switch (choice) {
                default -> System.out.println("Enter the right option");
                case 1 -> {
                    System.out.print("Scan element to insert at front: ");
                    item = sc.nextInt();
                    dequeue.insertFront(item);
                    dequeue.display();
                }
                case 2 -> {
                    System.out.print("Scan element to insert at rear: ");
                    item = sc.nextInt();
                    dequeue.insertRear(item);
                }
                //dequeue.display();
                case 3 -> {
                    System.out.println("Deleted element from front");
                    dequeue.deleteFront();
                }
                //dequeue.display();
                case 4 -> {
                    System.out.println("Deleted element from rear");
                    dequeue.deleteRear();
                }
                //dequeue.display();
                case 5 -> dequeue.getFront();
                case 6 -> dequeue.getRear();
                case 7 -> {
                    System.out.println("Elements in Dequeue:");
                    dequeue.display();
                }
                case 8 -> System.exit(1);
            }
        }
    }
}