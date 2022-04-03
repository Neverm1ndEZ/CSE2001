package arrays.accessanditeration;

import java.util.Arrays;

public class arrayReverse {
    public static int[] revArray(int[] arr){
        int[] ar = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            ar[j++] = arr[i];
        }
        return ar;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(revArray(arr)));
//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            System.out.println(arr[i]);
//        }
    }
}