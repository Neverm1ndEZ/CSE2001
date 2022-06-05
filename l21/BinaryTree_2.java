package l21;

public class BinaryTree_2 {

    /* Complete required code here */
    Node root;

    public BinaryTree_2() {
        root = null;
    }

    public BinaryTree_2(int data) {
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
              40    60    125  50
             /  \                \
            80  45                300

    */

    /*

        10 -> 30 20
        30 -> 40 60
        40 -> 80 45
        80 -> null null
        45 -> null null
        60 -> null null
        20 -> 125 50
        125 -> null null
        50 -> null 300
        300 ->null null

    */

    /* Driver main method */
    public static void main(String[] args) {
        /* Complete required code here */
        BinaryTree_2 tree = new BinaryTree_2();
        tree.root = new Node(10);

        tree.root.right = new Node(20);
        tree.root.left = new Node(30);

        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(60);

        tree.root.right.right = new Node(50);
        tree.root.right.left = new Node(125);

        tree.root.left.left.right = new Node(45);
        tree.root.left.left.left = new Node(80);

        tree.root.right.right.right = new Node(300);

        tree.displayTree(tree.root);
    }
}