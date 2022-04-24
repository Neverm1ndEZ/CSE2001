package stacksl6;

import java.util.*;
public class arrayReverseStack {
    final static int STACK_MAX_SIZE = 30;
    private int []arr = new int[STACK_MAX_SIZE];
    private int top ;
    public arrayReverseStack() {
        top = -1;
    }
    public void push(int element) {
        // Complete the push operation
        if(top == STACK_MAX_SIZE - 1){
            System.out.println("Stack is full item cannot be added");
        }
        else{
            top++;
            arr[top] = element;
        }
    }
    public int pop() {
        // Complete the pop operation
        if(top == -1){ System.out.println("Stack Overflow"); }
        else{ return arr[top--]; }
        return -1;
    }
    public static void main(String []args) {
        int size, index;
        int []mainArr = new int[30];
        arrayReverseStack r = new arrayReverseStack();
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if(size < 0) {
            System.out.print("Invalid input! Size should be greater than 0.\n");
            return;
        }

        // Complete your code here
        // Insertion
        for(index = 0; index < size; index++){
            System.out.printf("Enter arr[%d] : ",index);
            mainArr[index] = sc.nextInt();
        }

        //Array display
        System.out.print("Array before reversing : ");
        for(index = 0; index < size; index++){
            System.out.print(mainArr[index]+" ");
        }
        // reversing array using stack
        for(index = 0; index < size; index++){
            r.push(mainArr[index]);
        }

        for(index = 0; index < size; index++){
            mainArr[index] = r.pop();
        }
        System.out.println();

        //Printing reverse array
        System.out.print("Array after reversing : ");

        for(index = 0; index < size; index++){
            System.out.print(mainArr[index]+" ");
        }
        System.out.printf("\n");
    }
}



