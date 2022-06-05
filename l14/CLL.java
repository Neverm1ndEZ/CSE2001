package l14;

public class CLL {
    private Node head = null; // head reference of Node type
    private Node tail = null; // tail refere to the
    // To check list is empty or not
    public boolean isEmpty() {
        return (head == null);
    }

    // Add node to circular 1-way linked list
    public void insertNode(int data) {
        Node node = new Node(data);
        if(isEmpty()){
            head = tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int data){
        Node node = head;
        if(isEmpty()){
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        if(node.data == data){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.data == data){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    // For printing Linked List
    public void displayList() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node cur = head;
        if(head != null){
            do {
                System.out.print(cur.data+" ");
                cur = cur.next;
            } while (cur != head);
        }
    }
}