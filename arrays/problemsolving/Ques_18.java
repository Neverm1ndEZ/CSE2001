package arrays.problemsolving;

public class Ques_18 {
    public static void main(String[] args) {
        int[] arr = {11,22,11,22};
        int arg1 = 11, arg2 = 22;
        System.out.println(checkElement(arr, arg1, arg2));
    }
    public static boolean checkElement(int[] arr, int arg1, int arg2){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arg1 || arr[i] == arg2){
                return true;
            }
        }
        return false;
    }
}