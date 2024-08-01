package Searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

// LEVEL ORDER TRAVERSAL
// https://www.geeksforgeeks.org/problems/level-order-traversal/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class bsf {

    static ArrayList<Integer> levelOrder(Node root) {
        // Your code here

        Queue<Node> queue = new LinkedList<Node>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int queueSize = queue.size();

            while (queueSize-- > 0) {

                Node temp = queue.remove();

                ans.add(temp.data);

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }

        return ans;
    }
}
