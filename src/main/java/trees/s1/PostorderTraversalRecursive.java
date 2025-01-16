package trees.s1;

import java.util.ArrayList;

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
public class PostorderTraversalRecursive {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        solve(A, result);
        return result;
    }

    public static void solve(TreeNode A, ArrayList<Integer> result) {
        if (A == null) return;
        solve(A.left, result);
        solve(A.right, result);
        result.add(A.val);
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
        PostorderTraversalRecursive solution = new PostorderTraversalRecursive();

        // Perform inorder traversal
        ArrayList<Integer> result = solution.postorderTraversal(root);

        // Print the result
        System.out.println("Postorder Traversal: " + result);
    }
}
