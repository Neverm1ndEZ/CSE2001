package queue;

public class CircularQueue {
    private static final int DEFAULT_SIZE = 8;
    public int[] arr;
    int front, rear, size;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.arr = new int[size];
        front = rear = -1;
    }

    public boolean isFull() { return ((rear + 1) % size == front); }

    boolean isEmpty() { return ((front == -1) || (rear == front - 1)); }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue status is Overflow"); return;
        } else if (isEmpty()) {
            rear = front = 0;
            arr[rear] = item;
            System.out.println("Item Inserted: " + item);
        } else {
            if (front == -1) {
                front++;
            }
            rear = (rear + 1) % size;
            arr[rear] = item;
            System.out.println("Item Inserted: " + item);
        }
    }

    public void dequeue() {
        int val = 0;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else if (rear == front) {
            val = arr[front];
            rear = front = -1;
            System.out.println("Element deleted: " + val);
        } else {
            val = arr[front];
            front = (front + 1) % size;
            System.out.println("Element deleted: " + val);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("No items to display");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + "  ");
            }
            System.out.println();
        }
    }
}