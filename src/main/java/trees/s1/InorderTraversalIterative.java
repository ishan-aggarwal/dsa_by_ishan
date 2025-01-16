package trees.s1;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for binary tree
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) {
 * val = x;
 * left=null;
 * right=null;
 * }
 * }
 */
public class InorderTraversalIterative {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = A;

        while (current != null || !stack.isEmpty()) {
            // basically the way we do
            // we go to the left if it is available
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                // once left is null
                // we print the previous one
                // and go towards the right of it
                TreeNode last = stack.pop();
                result.add(last.val);
                current = last.right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a more balanced binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        // Create an instance of InorderTraversalRecursive
        InorderTraversalIterative solution = new InorderTraversalIterative();

        // Perform inorder traversal
        ArrayList<Integer> result = solution.inorderTraversal(root);

        // Print the result
        System.out.println("Inorder Traversal: " + result);
    }
}
