package l17;

import java.util.*;

public class SumOfDigits {
    int sumOfDigitsRecursive(int n) {
        if (n < 0)
            return sumOfDigitsRecursive(-1 * n);
        if (n == 0)
            return 0;  // Complete base and recursive computations required
        else
            return (n % 10) + sumOfDigitsRecursive(n / 10);
    }

    public static void main(String[] args) {
        int n;
        SumOfDigits s = new SumOfDigits();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        System.out.print("Sum of digits of " + n + " : " + s.sumOfDigitsRecursive(n) + "\n");
    }
}