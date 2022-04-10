package stacksl4_5;

public class CustomStack {
    int[] arr;
    int top, size;

    public CustomStack(int capacity) {
        this.size = capacity;
        arr = new int[size];
        top = -1;
    }

    public void push(int item){
        if(isFull()){ System.out.println("Stack is full item cannot be added"); }
        else{  top++;  arr[top] = item;
            System.out.println("Added element is: "+arr[top]);
        }
    }

    public int pop(){
        if(isEmpty()){ System.out.println("Stack Overflow"); }
        else { return arr[top--]; }
        return -1;
    }

    public int peek(){
        if(isEmpty()){ System.out.println("Cant peek"); }
        else{ return arr[top]; }
        return 0;
    }

    public boolean isEmpty(){ return top == -1; }

    public void display(){
        if(top == -1){ System.out.println("No elements in display"); }
        for (int i = top; i >= 0 ; i--) { System.out.println(arr[i]); }
    }

    public boolean isFull() { return top == size - 1; }

    public int stackSize(){
        if (top == -1){ return 0; }
        else{ return top+1; }
    }
}