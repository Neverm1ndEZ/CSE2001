package l21;

class Node {
    int data;
    Node left, right;
    /* Parametrized constructor to initialize leaf node for insertion */
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}