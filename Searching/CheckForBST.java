package Searching;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class CheckForBST {

    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {

        return fun(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean fun(Node root, int min, int max) {

        if (root == null) {
            return true;
        }

        // min < root < max
        if (min >= root.data || root.data >= max) {
            return false;
        }

        return fun(root.left, min, root.data) && fun(root.right, root.data, max);

    }

}
