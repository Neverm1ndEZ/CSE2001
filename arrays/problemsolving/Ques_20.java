package arrays.problemsolving;

import java.util.Arrays;

public class Ques_20 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(Concatenate(arr1, arr2)));
    }

    public static int[] Concatenate(int[] arr1, int[] arr2) {
        int[] a = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, a, 0, arr1.length);
        System.arraycopy(arr2, 0, a, arr1.length, arr2.length);
//        for(int i = 0, j = 0, k = 0; i < arr1.length && j < arr2.length && k < a.length; i++, j++, k++){
//            a[k] = arr1[i];
//            a[a.length - arr1.length] = arr2[j];
//        }
        for (int j : a) {
            System.out.println(j);
        }
        return a;
    }
}