package arrays.problemsolving;

public class Ques_19 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(CountEven(arr));
    }

    private static int CountEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
