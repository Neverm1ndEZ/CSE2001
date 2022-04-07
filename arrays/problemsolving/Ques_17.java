package arrays.problemsolving;

public class Ques_17 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(CompareArray(arr1, arr2));
    }

    private static boolean CompareArray(int[] arr1, int[] arr2) {
        if(arr1.length == 0 && arr2.length == 0){
            return true;
        }
        if(arr1.length == arr2.length) {
            for (int i = 0, j = 0; i < arr1.length && j < arr2.length; i++, j++) {
                if (arr1[i] == arr2[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
