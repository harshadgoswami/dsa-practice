package Searching;

import java.util.ArrayList;

public class LeftView {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    int maxLevelViewed = -1;

    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // add code here.

        // preorder d - r - l

        int level = 0;

        ans.add(root.data);
        fun(root.left, level);
        fun(root.right, level);

        return ans;
    }

    void fun(Node root, int level) {

        if (root == null) {
            return;
        }

        if (maxLevelViewed < level) {
            ans.add(root.data);
            maxLevelViewed = level;
        }

        fun(root.left, level + 1);
        fun(root.right, level + 1);

    }
}
