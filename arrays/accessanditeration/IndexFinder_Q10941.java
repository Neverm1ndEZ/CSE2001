package arrays.accessanditeration;

public class IndexFinder_Q10941 {
    public static void main(String[] args) {
        int[] arr = {69, 25, 89, 54, 89};
        System.out.println(printIndex(arr, 89));
    }

    public static int printIndex(int[] arr, int element){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}