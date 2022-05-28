package l17;
import java.util.*;
public class SumOfArrayElements {
    int sumOfArrayElementsRecursive(int[] arr,int n) {
        if (n <= 0)
            return 0;
        else
            return sumOfArrayElementsRecursive(arr, n-1)+arr[n-1];
    }
    public static void main(String []args) {
        int n, i;
        SumOfArrayElements s = new SumOfArrayElements();
        System.out.print("Enter size : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter " + n + " elements : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Sum of array elements : " + s.sumOfArrayElementsRecursive(arr, n) + "\n");
    }
}
