package l17;

import java.util.*;
public class factorial {
    int factorialMethod(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return (n * factorialMethod(n-1)) ;
        }

    }
    public static void main ( String []args) {
        int n;
        factorial t = new factorial();
        System.out.print("Enter the number to compute factorial: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Factorial of " + n + " is: " + t.factorialMethod(n));

    }
}