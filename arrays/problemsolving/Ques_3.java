package arrays.problemsolving;

public class Ques_3 {
    public static void main(String[] args) {
        int[] arr = {1,12,9,3,5,3,78,4,3,9,18,56,1,5};
        int element = 1;
        System.out.println(CountElement(arr, element));
    }

    private static int CountElement(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                count++;
            }
        }
        return count;
    }
}
