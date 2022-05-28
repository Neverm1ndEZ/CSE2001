package l17;
import java.util.*;
public class SumOfNaturalNum {
    int sumRecursive(int n) {
        if (n == 1)
            return 1 ;        // Fill up the return for the base condition
        else
            return sumRecursive(n-1) + n ;     // Complete the required solution
    }
    public static void main(String []args) {
        int n;
        SumOfNaturalNum s = new SumOfNaturalNum();
        System.out.print("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n > 0)
            System.out.print("The sum of first " + n + " natural numbers : " + s.sumRecursive(n) + "\n");
        else
            System.out.print("Invalid Number\n");

    }

}
