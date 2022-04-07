package arrays.problemsolving;

public class Ques_15 {
    public static void main(String[] args) {

    }

    public static int[] sum(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length];
        for (int i = 0, j = 0, k = 0; i < arr1.length && j < arr2.length && k < arr3.length; i++, j++, k++) {
            arr3[k] = arr1[i] + arr2[j];
        }
        return arr3;
    }
}