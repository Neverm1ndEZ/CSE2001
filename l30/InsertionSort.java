package l30;

import java.util.*;
public class InsertionSort {
    public static void main(String []args) {
        int a[], i, n, j, temp, pos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        n = sc.nextInt();
        a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter element for a[" + i + "] : ");
            a[i] = sc.nextInt();
        }
        System.out.print("Before sorting the elements in the array are\n");
        for (i = 0; i < n; i++) {
            System.out.print("Value of a[" + i +"] = " + a[i] + "\n");
        }

        for (i = 0; i < n - 1; i++) {
            for(j = i+1;j > 0; j--){
                if(a[j] < a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }

        System.out.print("After sorting the elements in the array are\n");
        for (i = 0; i < n; i++) {
            System.out.println("Value of a[" + i + "] = " + a[i]);
        }
    }

}
