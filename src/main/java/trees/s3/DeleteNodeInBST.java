package trees.s3;

import trees.s1.TreeNode;

/**
 * Q3. Delete a node in BST
 *
 * Problem Description
 * Given a Binary Search Tree(BST) A. If there is a node with value B present in the tree delete it and return the tree.
 * Note - If there are multiple options, always replace a node by its in-order predecessor
 *
 * Problem Constraints
 * 2 <= No. of nodes in BST <= 105
 * 1 <= value of nodes <= 109
 * Each node has a unique value
 *
 * Input Format
 * The first argument is the root node of a Binary Search Tree A.
 * The second argument is the value B.
 *
 * Output Format
 * Delete the given node if found and return the root of the BST.
 *
 * Example Input
 * Input 1:
 *
 *             15
 *           /    \
 *         12      20
 *         / \    /  \
 *        10  14  16  27
 *       /
 *      8
 *
 *      B = 10
 *
 * Input 2:
 *
 *             8
 *            / \
 *           6  21
 *          / \
 *         1   7
 *
 *      B = 6
 *
 *
 *
 * Example Output
 * Output 1:
 *
 *             15
 *           /    \
 *         12      20
 *         / \    /  \
 *        8  14  16  27
 *
 * Output 2:
 *
 *             8
 *            / \
 *           1  21
 *            \
 *             7
 *
 *
 *
 * Example Explanation
 * Explanation 1:
 * Node with value 10 is deleted
 * Explanation 2:
 * Node with value 6 is deleted
 */

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class DeleteNodeInBST {
    public TreeNode solve(TreeNode A, int B) {

        // base condition
        if (A == null) {
            return null;
        }

        // it means value is bigger than root value
        // move to the right subtree
        if (A.val < B) {
            A.right = solve(A.right, B);
            // return A;
        }

        // it means value is smaller than root value
        // move to the left subtree
        else if (A.val > B) {
            A.left = solve(A.left, B);
            // return A;
        }

        else {

            // node to be deleted is leaf node
            if (A.left == null && A.right == null) {
                return null;
            }

            // node to be deleted has one child
            if (A.left == null) {
                return A.right;
            }

            if (A.right == null) {
                return A.left;
            }

            // find possible replacement of the node to be deleted
            // in the left subtree
            // we will find the largest node by travelling to the right of it
            TreeNode temp = findPossibleReplacement(A.left);
            A.val = temp.val;
            A.left = solve(A.left, temp.val);

            // return A;
        }
        return A;
    }

    private TreeNode findPossibleReplacement(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
}