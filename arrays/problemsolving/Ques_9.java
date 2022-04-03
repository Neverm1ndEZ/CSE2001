package arrays.problemsolving;

public class Ques_9 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 12};
        System.out.println(SequenceCheck(arr));
    }

    public static boolean SequenceCheck(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 6){
                continue;
            }
            if(arr[i] == 6){
                if(arr[i+1] == 9){
                    if(arr[i+2] == 12){
                        return true;
                    }
                }
            }
//            if(arr[i] == 6 && arr[i] == 9 && arr[i] == 12){
//                return true;
//            }
        }
        return false;
    }
}