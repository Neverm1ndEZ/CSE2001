package l15;

import java.util.*;
public class Stack {
    private Node top;
    public Stack() {
        this.top = null; // default constructor to initialize stack
    }

    // Method to check if the stack is empty or not
    public boolean isEmpty() { return top == null; }
    // Method to push element in stack similar to insertion at the begining
    public void pushItem(int item) {
        Node node = new Node();
        if(node == null){
            System.out.println("Stack Overflow");
            return;
        }
        node.data = item;
        node.next = top;
        top = node;
    }

    // function to pop top element from the stack same as deletion from the begining
    public void popItem() {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Data poped from top: "+top.data);
        top = top.next;
    }

    // Function returns top element in the stack
    public void stackPeek() {
        if(isEmpty()){
            System.out.println("Nothing in stack, stack is empty");
            return;
        }
        System.out.println("Element at peek is: "+top.data);
    }

    public void displayStack() {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        Node cur = top;
        System.out.println("Stack is :");
        while(cur != null){
            System.out.println("| "+cur.data+" |");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int op, item;
        System.out.println("Stack using link list");
        while (true) {
            System.out.print("1.Push operation\n2.Pop operation\n3.Get the stack peek\n4.Display stack\n5.Exit\n");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    item = sc.nextInt();
                    stack.pushItem(item);
                    stack.displayStack();
                }
                case 2 -> {
                    stack.popItem();
                    stack.displayStack();
                }
                case 3 -> stack.stackPeek();
                case 4 -> stack.displayStack();
                case 5 -> System.exit(1);
            }
        }
    }
}