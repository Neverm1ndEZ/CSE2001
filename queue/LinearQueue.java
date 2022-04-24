package queue;
class LinearQueue {
    int maxCapacity;
    int[] items;
    int front;
    int rear;

    public LinearQueue(int size) {
        front = -1;
        rear = -1;
        this.maxCapacity = size;
        items = new int[maxCapacity];
    }

    public boolean isFull() {
        /* Write the required functionality here */
        if(rear == maxCapacity - 1){
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        /* Write the required functionality here */
        if((front == -1) || (rear == front - 1)){
            return true;
        }
        return false;
    }

    public void enqueue(int item) {
        /* Write the required functionality here */
        if (isFull()) {
            System.out.println("Queue status is Overflow");
        } else {
            if (front == -1) {
                front++;
            }
            items[++rear] = item;
            System.out.println("Item Inserted: " + item);
        }
    }

        public void dequeue() {
            /* Write the required functionality here */
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            } else {
                int val = items[front];
                front++;
                System.out.println("Element deleted: " + val);
            }
        }

        /* Method to display elements of Queue */
        public void display() {
            /* Write the required functionality here */
            if (isEmpty()) {
                System.out.println("No items to display");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(items[i] + "  ");
                }
                System.out.println();
            }
        }
    }