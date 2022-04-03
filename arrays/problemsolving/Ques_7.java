package arrays.problemsolving;

public class Ques_7 {
    public static void main(String[] args) {
        int[] arr = {-35, -52, -12, -99};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                continue;
            }
            sum += arr[i];
        }
        return sum;
    }
}