package queue;

import java.util.Scanner;

public class Deque {
    private static final int DEFAULT_SIZE = 5;
    public int[] arr;
    int front, rear, size;

    public Deque(int[] arr) { this(DEFAULT_SIZE); }

    public Deque(int size) {
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }

    public boolean isFull(){ return ((front == 0 && rear == size - 1) || (front == rear + 1)); }

    public boolean isEmpty(){ return (front == -1 && rear == -1); }

    public void insertFront(int item){
        if(isFull()){ System.out.println("Deque is Full, Overflow"); return; } // checking overflow condition

        if(isEmpty()){ front = 0; rear = 0; } // if queue is initially empty

        else if (front == 0) { front = size - 1; } // circular array concept, taking the front pointer to size - 1

        else{ front = (front - 1); } // or front -= 1 // decreasing front by 1

        arr[front] = item; // insertion
        //System.out.println(arr[front]); // confirmation

        //worked on CT
        /*
            if (isFull()) { System.out.println("Dequeue Overflow"); return; }
        else if (front == -1) { front = 0; rear = 0; }
        else if (front == 0) { front = size - 1; }
        else { front--; }
        array[front] = item;
         */
    }

    public void insertRear(int item){
        if(isFull()){ System.out.println("Deque is Full, Overflow"); return; } // checking overflow condition

        if(isEmpty()){ front = rear = 0; } // if queue is initially empty

        else if (rear == size - 1) { rear = 0; } // circular array concept, taking the rear pointer to 0

        else { rear++; } // or rear += 1 // increasing rear by 1

        arr[rear] = item; // insertion
        //System.out.println(arr[rear]); // confirmation

        // worked on CT
        /*
            if (isFull()) {  System.out.println("Dequeue Overflow"); return; }
        else if (front == -1) { front = 0; rear = 0; }
        else if (rear == size - 1) { rear = 0; }
        else { rear++; }
        array[rear] = item;
         */
    }

    public void deleteFront(){
        if(isEmpty()){ System.out.println("Deque is Empty, Underflow"); return; } // checking underflow condition
        int val = arr[front];

        if (front == rear){ front = rear = -1; } // if front and rear are pointing to same index

        else if (front == (size - 1)) { front = 0; } // circular array concept. setting front index to 0

        else { front++; }

        System.out.println("Element deleted from the front is: "+val);
    }

    public void deleteRear(){
        if(isEmpty()){ System.out.println("Deque is Empty, Underflow"); } // checking underflow condition
        int val = arr[rear];

        if (front == rear){ rear = front = -1; } // if front and rear are pointing to same index

        else if (rear == 0) { rear = (size - 1); } // circular array concept. setting front index to 0

        else { rear--; }

        System.out.println("Element deleted from the front is: "+val);
    }

    public void getFront(){
        if(isEmpty()){ System.out.println("Deque is Underflow"); }
        else{ System.out.println(arr[front]); }
    }

    public void getRear(){
        if(isEmpty()){ System.out.println("Deque is Underflow"); }
        else{ System.out.println(arr[rear]); }
    }

    public void display(){
        if(isEmpty())
            System.out.print("Queue is Empty");
        else {
            if(rear >= front) {
                for( int i=front;i<= rear;i++)
                    System.out.print(arr[i]+" ");
            }
            else {
                for( int i=front;i<size;i++)
                    System.out.print(arr[i]+" ");
                for( int i=0;i<=rear;i++)
                    System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Deque Implementation using circular fixed size array");
        System.out.print("Enter the size of Dequeue: ");
        int capacity=sc.nextInt();
        int item;
        Deque dequeue=new Deque(capacity);
        System.out.println("Enter 1 to Insert at front\nEnter 2 to insert at rear\nEnter 3 delete at front\nEnter 4 to delete at rear\nEnter 5 to get front element\nEnter 6 to get rear element\nEnter 7 to display Dequeue\nEnter 8 to exit");
        while(true){
            System.out.print("Enter your option: ");
            int choice=sc.nextInt();
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
                case 3 -> {
                    System.out.println("Deleted element from front");
                    dequeue.deleteFront();
                }
                case 4 -> {
                    System.out.println("Deleted element from rear");
                    dequeue.deleteRear();
                }
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