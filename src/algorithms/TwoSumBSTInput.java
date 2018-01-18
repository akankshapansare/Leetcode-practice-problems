package algorithms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by akanksha on 11/29/2017.
 */
public class TwoSumBSTInput {

    public class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            val = data;
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList();

        if (root == null) {
            return false;
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            if (queue.peek() != null) {
                TreeNode node = queue.remove();
                if (hashSet.contains(k - node.val)) {
                    return true;
                }
                hashSet.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            } else {
                queue.remove();
            }
        }

        return false;
    }
}
