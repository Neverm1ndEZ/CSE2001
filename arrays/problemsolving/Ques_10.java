package arrays.problemsolving;

public class Ques_10 {
    public static void main(String[] args) {
        int[] arr= {7,6,3,5,8};
        System.out.println(SequenceCheck(arr));
    }

    public static boolean SequenceCheck(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && arr[i] == 2 || arr[i] == 3) {
                return true;
            }
        }
        return false;
    }
}