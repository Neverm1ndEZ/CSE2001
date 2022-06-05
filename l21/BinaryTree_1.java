package l21;

public class BinaryTree_1 {

    /* Complete required code here */
    Node root;

    public BinaryTree_1() {
        root = null;
    }

    public BinaryTree_1(int data) {
        root = new Node(data);
    }

    /* Recursive display just for display purpose */
    public void displayTree(Node rNode) {
        if (rNode == null) { // Base condition when we hit leaf node while Top to down
            return;
        }
        String str = rNode.data + " -> ";

        str += (rNode.left == null) ? " null" : " " + rNode.left.data;
        str += (rNode.right == null) ? " null" : " " + rNode.right.data;

        System.out.println(str);

        displayTree(rNode.left); // Recuring towards left
        displayTree(rNode.right); // Recuring towards right
    }

    /*

                      10
                  /       \
                 30         20
               /   \        / \
              40    60   null  50
             /  \
           null  45

    */

    /*

        10 -> 30 20
        30 -> 40 60
        40 -> null 45
        45 -> null null
        60 -> null null
        20 -> null 50
        50 -> null null

    */

    /* Driver main method */
    public static void main(String[] args) {
        /* Complete required code here */
        BinaryTree_1 tree = new BinaryTree_1();
        tree.root = new Node(10);

        tree.root.right = new Node(20);
        tree.root.left = new Node(30);

        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(60);

        tree.root.right.right = new Node(50);

        tree.root.left.left.right = new Node(45);
        tree.displayTree(tree.root);
    }
}