package queue;

public class CustomQueue {
    int[] arr;
    int size, front, end;

    public CustomQueue(int size) {
        this.size = size;
        front = end = -1;
    }

    public boolean isFull(){ return end == size - 1; }

    public boolean isEmpty(){ return front == -1; }

    public void enQueue(int item){
        if(isFull()){
            System.out.println("Cant Enqueue");
        }
        else{
            if(front == -1){
                front++;
            }
            end++;
            arr[end] = item;
        }
    }

    public int deQueue(){
        int x = arr[front];
        front++;
        return x;
    }

    public void peek(){
        System.out.println(arr[front]);
    }


}