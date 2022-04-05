package arrays.problemsolving;

public class Ques_14 {
    public static void main(String[] args) {
        int[] arr1 = {9, 7, 3, 6, 9}; //output 1
        int[] arr2 = {2, 6, 8, 2, 1}; //output 0
        int[] arr3 = {10, 20, 30, 1, 2, 3}; //output 2
        System.out.println(SequenceCount(arr3));
    }

    public static int SequenceCount(int[] arr) {
        int count = 0, temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            if (arr[i + 1] == (temp * 3)) {
                break;
            }
            if (arr[i + 1] == (temp * 2) || arr[i + 1] == (temp * 3)) {
                count++;
            }
        }
        return count;
    }
}