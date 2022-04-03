package arrays.problemsolving;

public class Ques_2 {
    public static void main(String[] a) {
        int[] arr = {1,2,3,6};
        System.out.println(checkFirstOrLast(arr, 2));
    }

    public static boolean checkFirstOrLast(int[] arr, int arg){
        for (int i = 0; i < arr.length; i = i + arr.length - 1) {
            if (arr[i] == arg) {
                return true;
            }
        }
        return false;
    }
}