import java.util.Scanner;

class Student {
    String name;
    int id;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name and ID: ");
        name = sc.nextLine();
        id = sc.nextInt();
    }

    void display() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student ID: " + this.id);
    }
}

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.display();
    }
}