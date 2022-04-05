package arrays.problemsolving;

public class Ques_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int element = 2;
        System.out.println(ElementFinder(arr, element));
    }

    public static boolean ElementFinder(int[] arr, int element) {
        for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {
            if(arr[i] == arr[j]){
                return false;
            }
            else if(arr[i] == element){
                return true;
            }
        }
        return false;
    }
}