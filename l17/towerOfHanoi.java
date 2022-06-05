package l17;
import java.util.*;
public class towerOfHanoi {
    public void towerOfHanoiMethod(int n, char s, char h, char d) {
        // Write your code here and complete the solution
        if(n == 1){
            System.out.println("Move disk - "+n+" from pole "+s+" to "+d);
            return;
        }
        towerOfHanoiMethod(n-1, s, d, h);
        System.out.println("Move disk - "+n+" from pole "+s+" to "+d);
        towerOfHanoiMethod(n-1, h, s, d);
    }

    // Driver main method
    public static void main ( String []args) {
        int n;
        towerOfHanoi t = new towerOfHanoi();
        System.out.print("Enter number of disks : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t.towerOfHanoiMethod(n, 'A', 'B', 'C');
    }
}
