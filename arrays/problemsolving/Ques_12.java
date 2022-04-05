package arrays.problemsolving;

public class Ques_12 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 1, 1, 1, 2, 3, 1};
        System.out.println(SequenceCount(arr));
    }
    public static int SequenceCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 1 && arr[i+1] == 1){
                count++;
            }
        }
        return count;
    }
}
