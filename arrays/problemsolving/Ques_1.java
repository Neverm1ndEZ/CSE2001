package arrays.problemsolving;

public class Ques_1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 0};
        System.out.println(sum(arr));
    }
    public static long sum(int[] arr){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}