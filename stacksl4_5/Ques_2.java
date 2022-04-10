package stacksl4_5;
import java.util.Scanner;
public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int capacity = sc.nextInt();
        CustomStack st = new CustomStack(capacity);
        System.out.println("""
                Enter 1 to push
                Enter 2 to pop
                Enter 3 to display stack
                Enter 4 to display the peek
                Enter 5 to display the size of stack
                Enter 6 to exit""");
        while (true) {
            System.out.print("Enter your option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> { System.out.print("Scan element to push: ");
                    int item = sc.nextInt(); st.push(item);
                }
                case 2 -> { if(st.isEmpty()) System.out.println("Stack Underflow");
                    else System.out.println("Element popped is: "+st.pop()); }
                case 3 -> { System.out.println("Element in stack: "); st.display(); }
                case 4 -> { System.out.println("Peek of stack is: "+st.peek()); }
                case 5 -> { System.out.println("Size of stack is: "+st.stackSize()); }
                case 6 -> { System.exit(1); }
                default -> System.out.println("Enter the right option");
            }
        }
    }
}