package arrays.problemsolving;

public class Ques_22 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findAvg(arr));
    }
    public static int findAvg(int[] arr){
        int avg = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;
        }
        return avg;
    }
}