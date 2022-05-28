package l17;

import java.util.*;
public class Fib {
    int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;  // Complete base condition and recursive computations
        else
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
    public static void main(String []args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Fib f = new Fib();
        System.out.print("Enter a natural number : ");
        n = sc.nextInt();
        if (n > 0)
            System.out.print("The fibonacci number at position " + n + " is: " + f.fibonacciRecursive(n) + "\n");
        else
            System.out.print("Invalid number\n");

    }
}