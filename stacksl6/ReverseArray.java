package stacksl6;

import java.util.Scanner;

public class ReverseArray {
    public final static int STACK_MAX_SIZE = 30;
    private static int[] arr = new int[STACK_MAX_SIZE];
    private int top;
    public ReverseArray() {
        top = -1;
    }

    public void push(int element){
        if(top == STACK_MAX_SIZE - 1){ System.out.println("Stack is full item cannot be added"); }
        else{  top++;  arr[top] = element; }
    }

    public int pop(){
        if(top == -1){ System.out.println("Stack Overflow"); }
        else { return arr[top--]; }
        return -1;
    }

    public static void main(String[] args) {
        int size, index;
        int []mainArr = new int[30];
        ReverseArray r =  new ReverseArray();
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if(size < 0) {
            System.out.println("Invalid input! Size should be greater than 0");
            return;
        }

        for(index = 0; index < size; index++) {
            System.out.printf("Enter arr[%d]: ", index);
            mainArr[index] = sc.nextInt();
        }

        System.out.print("Array before reversing: ");

        for (index = 0; index < size; index++){
            System.out.print(mainArr[index]+" ");
        }

        for (index = 0; index < arr.length; index++) {
            r.push(mainArr[index]);
        }

        for (index = 0; index < size; index++) {
            mainArr[index] = r.pop();
        }
        System.out.println();
        System.out.print("Array after reversing: ");

        for (index = 0; index < size; index++){
            System.out.print(mainArr[index]+" ");
        }

        System.out.printf("\n");
    }
}