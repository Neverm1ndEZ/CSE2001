import java.util.*;
public class Trendy_CA5 {
    class Node{
        int Code;
        double Price;
        String Colour;
        Node prev, next;

        public Node(int code, double price, String colour) {
            Code = code;
            Price = price;
            Colour = colour;
        }
    }
    Node head = null, tail = null;

    boolean isListEmpty(){
        return head == null;
    }

    public void addAtStart(int code, double price, String colour){
        Node node = new Node(code,price,colour);
        if(isListEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void addAtEnd(int code, double price, String colour){
        Node node = new Node(code,price,colour);
        if (isListEmpty()) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
    }

    public void deleteFirst(){
        if (isListEmpty()){
            System.out.println("List empty");
        } else {
            if (head.next == null){
                System.out.println(head.Code + " is deleted from the collection of garments");
                head = head.next;
            } else {
                System.out.println(head.Code + " is deleted from the collection of garments");
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void deleteLast(){
        if (isListEmpty()){
            System.out.println("List empty");
        } else {
            if (head.next == null){
                System.out.println(head.Code + " is deleted from the collection of garments");
                head = head.next;
            } else {
                System.out.println(tail.Code + " is deleted from the collection of garments");
                tail = tail.prev;
                tail.prev = null;
            }
        }
    }

    public void showStart(){
        if (isListEmpty()) {
            System.out.println("Nothing to display");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.Code + "\t" + curr.Colour + "\t"+ curr.Price);
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public void showEnd(){
        if (isListEmpty()) {
            System.out.println("Nothing to display");
        } else {
            Node curr = tail;
            while (curr != null) {
                System.out.print(curr.Code + "\t" + curr.Colour + "\t"+ curr.Price);
                curr = curr.prev;
            }
            System.out.println();
        }
    }

    public int countHowMany(String colour){
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trendy_CA5 tr = new Trendy_CA5();
        int choice, code;
        double price;
        String colour;
        do {
            System.out.println("What's your choice");
            System.out.println("1.Add garment at first\n2.Add garment at last\n3.Forward Traversal\n4.Backward Traversal\n5.DeleteFirst\n6.DeleteLast\n7.Show count of a particular colour");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter dress code, price and color");
                    code = sc.nextInt();
                    price = sc.nextDouble();
                    sc.nextLine();
                    colour = sc.nextLine();
                    tr.addAtStart(code, price, colour);
                }
                case 2 -> {
                    System.out.println("Enter dress code, price and color");
                    code = sc.nextInt();
                    price = sc.nextDouble();
                    sc.nextLine();
                    colour = sc.nextLine();
                    tr.addAtEnd(code, price, colour);
                }
                case 3 -> {
                    tr.showStart();
                }
                case 4 -> {
                    tr.showEnd();
                }
                case 5 -> {
                    tr.deleteFirst();
                }
                case 6 -> {
                    tr.deleteLast();
                }
                case 7 -> {
                    System.out.print("enter the colour of dress to count");
                    sc.nextLine();
                    colour = sc.nextLine();
                    System.out.println("No. of "+colour+" colour dresses present are: "+tr.countHowMany(colour));
                }
                default -> System.out.println("Enter right choice");
            }
        } while (choice != 0);
    }
}