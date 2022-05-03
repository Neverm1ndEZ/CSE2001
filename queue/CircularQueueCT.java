package queue;

public class CircularQueueCT {
    private int[] queue; // Array to maintain queue
    private int capacity; // Fixed capacity of the queue
    private int front;    // To trace front location pointer
    private int rear;   // To trace rear location pointer

    public CircularQueueCT(int capacity) {
        this.capacity = capacity;
        queue = new int[this.capacity];
        front = -1;
        rear = -1;
    }
    public void enqueue(int item) {
        if(isFull()) {	System.out.println("Queue is full, Overflow");	return; }
        if(isEmpty()) {	front = 0;    }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
    }

    public void dequeue() {
        int val;
        if(isEmpty()){ System.out.println("Queue is Empty, Underflow"); }
        else if(rear == front){
            val = queue[front];
            front = rear = -1;
            System.out.println("Element deleted is: "+val);
        }
        else{
            val = queue[front];
            front = (front + 1) % capacity;
            System.out.println("Element deleted is: "+val);
        }
    }

    public void display() {
        if(isEmpty()) {    System.out.println("Queue is empty");	return;   }
        if ( front <= rear ) {
            for( int i = front; i <= rear; i = i + 1) {
                System.out.print(queue[i]+" ");
            }
        } else {
            for( int i = front; i <= (capacity - 1); i = i + 1) {
                System.out.print(queue[i]+" ");
            }

            for( int i = 0; i <= rear; i = i + 1) {
                System.out.print(queue[i]+" ");
            }
        }
        System.out.println();
    }

    private boolean isEmpty() { return (front == -1 && rear == -1); }

    private boolean isFull() { return ((front == (rear + 1)) || ((front == 0) && (rear == capacity - 1))); }

    public void frontPeek() {	if(isEmpty()){ System.out.println("Queue is Empty"); return; }
        System.out.println("Element at front: "+queue[front]);
    }

    public void rearPeek() {	if(isEmpty()){ System.out.println("Queue is Empty"); return; }
        System.out.println("Element at Rear: "+queue[rear]);
    }
}
