import java.util.Scanner;

public class Solution {
    int[] a;
    int size, top;

    public Solution(int size) {
        this.size = size;
        a = new int[size];
        top = 0;
    }

    public void push(int item){
        if (top == size){
            System.out.println("Stack Full");
        }
        else{
            a[top] = item;
        }
    }

    public int pop(){
        return a[top];
    }

    public static void main(String[] args) {
        int n, ele, maxSum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of cards: ");
        n = sc.nextInt();
        Solution s1 = new Solution(n);
        Solution s2 = new Solution(n);
        System.out.print("Enter karan card no.s: ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt();
            s1.push(ele);
        }
        System.out.print("Enter rita card no.s: ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt();
            s2.push(ele);
        }
        System.out.print("Enter the max sum value: ");
        maxSum = sc.nextInt();
        s1.game(s1, s2, n, maxSum);
    }

    public void game(Solution s1, Solution s2, int n, int maxSum) {
//        int sum1 = 0, sum2 = 0;
//        do {
//            s1.pop();
//            sum1 += s1.pop();
//            s2.pop();
//            sum2 += s1.pop();
//        }while (sum1 >= maxSum || sum2 >= maxSum);
        int sum1 = 0, sum2 = 0;
        for (int i = 0, j = 0; i < n && j < n ; i++, j++) {
            sum1 += s1.pop();
            sum2 += s2.pop();
//
//            if(sum1 >= maxSum){
//
//                // code
//
//            }
//            else if(sum2 >= maxSum){
//                System.out.println("Rita");
//            }
//            else{
//                System.out.println("tie");
//            }
        }
    }
}