package arrays.problemsolving;

public class Ques_11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 6, 3, 5, 4};
        int[] arr2 = {3, 2, 1, 6, 5, 4};
        FindMid(arr2);
    }

    public static void FindMid(int[] arr) {
        int n = arr.length - 1;
        if (n % 2 == 0) {
            System.out.println(arr[n / 2]);
        } else {
            System.out.println(arr[(n / 2)]);
            System.out.println(arr[(n + 1) / 2]);
        }
    }
}