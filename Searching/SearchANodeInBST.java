package Searching;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class SearchANodeInBST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        if (root == null) {
            return false;
        }

        if (root.data == x) {
            return true;
        }

        if (x > root.data) {
            return search(root.right, x);
        }

        return search(root.left, x);
    }
}
