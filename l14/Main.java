package l14;

public class Main {
    public static void main(String[] args) {
        CLL l = new CLL();
        l.insertNode(55);
        l.insertNode(56);
        l.insertNode(5);

        l.displayList();
        System.out.println();

        l.delete(56);
        l.displayList();
        System.out.println();

        l.delete(55);
        l.displayList();
        System.out.println();

        l.delete(5);
        l.displayList();
        System.out.println();
    }
}