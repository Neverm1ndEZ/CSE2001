package arrays.accessanditeration;

public class countNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1};
        System.out.println(countElement(arr, 1));
    }

    public static int countElement(int[] arr, int element){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                count++;
            }
        }
        return count;
    }
}