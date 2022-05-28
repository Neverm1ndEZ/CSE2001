package l30;

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int a[], i, j, n, key, flag, low, high, mid, temp;
        flag = 0;
        mid = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        n = sc.nextInt();
        a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter element for a[" + i + "] : ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter key element : ");
        key = sc.nextInt();
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("After sorting the elements in the array are\n");
        for (i = 0; i < n; i++) {
            System.out.print("Value of a[" + i + "] = " + a[i] + "\n");
        }

        low = 0; // start
        high = n - 1; //end

        while(low <= high){

            mid = low + (high - low) / 2;

            if(key < a[mid]){
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            }else{
                flag = 1; break;
            }
        }

        if (flag == 1) {
            System.out.print("The key element " + key + " is found at the index " + mid + "\n");
        } else {
            System.out.print("The Key element " + key + " is not found in the array\n");
        }
    }

}