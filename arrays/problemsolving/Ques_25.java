package arrays.problemsolving;

public class Ques_25 {
    public static boolean compareCountOf(int[] arr, int arg1, int arg2) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arg1){
                count1++;
            }
            else if (arr[i] == arg2){
                count2++;
            }
        }
        if(count1 > count2) return true;
        else if (arg1 == arg2) return false;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {99, -100, 99, 1};
        int arg1 = 99;
        int arg2 = 99;
        System.out.println(compareCountOf(arr,arg1,arg2));
    }
}