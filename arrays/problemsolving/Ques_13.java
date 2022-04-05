package arrays.problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int ele = sc.nextInt();
        System.out.println(Arrays.toString(Initialize(len,ele)));
    }
    public static int[] Initialize(int len, int ele){
        int[] a = new int[len];
        for(int i = 0; i < len; i++){
            a[i] = ele;
        }
        return a;
    }
}