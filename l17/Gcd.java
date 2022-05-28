package l17;

import java.util.*;
public class Gcd {
    int gcdRecursive(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;  // Complete base condition and computations in return
        else
            return gcdRecursive(num2, num1 % num2);
    }
    public static void main(String[] args) {
        int a, b;
        Gcd g = new Gcd();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("The gcd of " + a + " and " + b + " : " + g.gcdRecursive(a, b) + "\n");

    }
}