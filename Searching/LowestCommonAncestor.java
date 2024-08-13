package Searching;

// https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class LowestCommonAncestor {

    // Function to return the lowest common ancestor in a Binary Tree.
    Node lca(Node root, int n1, int n2) {

        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;

    }
}
