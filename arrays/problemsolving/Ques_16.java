package arrays.problemsolving;

public class Ques_16 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(CompareArray(arr1, arr2));
    }

    private static boolean CompareArray(int[] arr1, int[] arr2) {
        if(arr1.length == arr2.length){
            return true;
        }
        return false;
    }
}
