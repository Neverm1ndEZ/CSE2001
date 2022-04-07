package arrays.problemsolving;

public class Ques_21 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(FindDiff(arr));
    }
    public static int FindDiff(int[] arr){
        int diff = 0;
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
            else if(arr[i] < min) min = arr[i];
        }
        diff = max - min;
        return diff;
    }
}
