package arrays.problemsolving;

public class Ques_10 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 2};
        System.out.println(SequenceCheck(arr));
    }

    public static boolean SequenceCheck(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                i++;
                if (arr[i] == 2 || arr[i+1] == 3 && arr[i] == 3 || arr[i+1] == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}