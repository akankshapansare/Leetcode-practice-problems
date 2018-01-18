package algorithms;

import java.util.*;

public class AverageOfLevelInBinaryTree {

    public class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.val = data;
            left = null;
            right = null;
        }
    }

    public TreeNode root = null;

    public void insertNode(int data) {
        TreeNode newNode = new TreeNode(data);

        if (root == null) {
            root = newNode;
            return;
        }

        TreeNode current = root;
        while (current != null) {
            if (newNode.val > current.val) {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                } else {
                    current = current.right;
                }
            } else {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                } else {
                    current = current.left;
                }
            }
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            long sum = 0, count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode n = queue.remove();
                sum += n.val;
                count++;
                if (n.left != null)
                    temp.add(n.left);
                if (n.right != null)
                    temp.add(n.right);
            }
            queue = temp;
            res.add(sum * 1.0 / count);
        }
        return res;
    }

    public static void main(String[] args) {
        AverageOfLevelInBinaryTree myBst = new AverageOfLevelInBinaryTree();
        myBst.insertNode(7);
        myBst.insertNode(2);
        myBst.insertNode(3);
        myBst.insertNode(9);
        myBst.insertNode(15);

//        myBst.inOrderTraversal(myBst.root);
//        myBst.preOrderTraversal(myBst.root);
//        myBst.postOrderTraversal(myBst.root);

        List<Double> result = myBst.averageOfLevels(myBst.root);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
