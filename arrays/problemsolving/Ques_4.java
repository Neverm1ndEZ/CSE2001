package arrays.problemsolving;

public class Ques_4 {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 8, 7};
        int[] arr2 = {3, 5, 4};
        System.out.println(checkFirstOrLast(arr1, arr2));
    }

    public static boolean checkFirstOrLast(int[] arr1, int[] arr2) {
        for (int i = 0, j = 0; i < arr1.length && j < arr2.length; i = i + arr1.length - 1, j = arr2.length - 1) {
            if (arr1[i] == arr2[j]) {
                return true;
            }
        }
        return false;
    }
}