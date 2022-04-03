package arrays.problemsolving;

public class Ques_8 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 8};
        swap(arr);
    }

    public static void swap(int[] arr) {
        int temp;
        for (int i = 0, j = arr.length - 1; i < arr.length && j > 0; i++, j--) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}