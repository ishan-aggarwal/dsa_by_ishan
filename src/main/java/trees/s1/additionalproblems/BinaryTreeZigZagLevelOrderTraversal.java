package trees.s1.additionalproblems;

import trees.s1.TreeNode;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
public class BinaryTreeZigZagLevelOrderTraversal {
    public List<List<Integer>> zigZagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }
        queue.add(root);
        boolean isLeftView = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 1; i <= size; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            if (!isLeftView) {
                Collections.reverse(currentLevel);
            }
            result.add(currentLevel);
            isLeftView = !isLeftView;
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Create an instance of BinaryTreeLevelOrderTraversal
        BinaryTreeZigZagLevelOrderTraversal solution = new BinaryTreeZigZagLevelOrderTraversal();

        // Perform level order traversal
        List<List<Integer>> result = solution.zigZagLevelOrder(root);

        // Print the result in the desired format
        System.out.println(result);
    }
}