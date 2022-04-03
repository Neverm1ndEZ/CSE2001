package arrays.problemsolving;

public class Ques_6 {
    public static void main(String[] args) {
        int[] arr = {33, 55, 69, 99, 3};
        System.out.println(elementFinder(arr));
    }

    public static boolean elementFinder(int[] arr){
        int i = 0, j = arr.length - 1;
            if (arr[i] == arr[j]){
                return true;
            }
        return false;
    }
}