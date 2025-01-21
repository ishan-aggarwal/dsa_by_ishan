package trees.s3.additionalproblems;

import trees.s1.TreeNode;


/**
 * Q3. BST nodes in a range
 *
 * Problem Description
 * Given a binary search tree of integers. You are given a range B and C.
 * Return the count of the number of nodes that lie in the given range.
 *
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 100000
 * 0 <= B < = C <= 109
 *
 * Input Format
 * First argument is a root node of the binary tree, A.
 * Second argument is an integer B.
 * Third argument is an integer C.
 *
 * Output Format
 * Return the count of the number of nodes that lies in the given range.
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
 *      B = 12
 *      C = 20
 * Input 2:
 *
 *             8
 *            / \
 *           6  21
 *          / \
 *         1   7
 *
 *      B = 2
 *      C = 20
 *
 *
 * Example Output
 * Output 1:
 *  5
 * Output 2:
 *  3
 *
 * Example Explanation
 * Explanation 1:
 *  Nodes which are in range [12, 20] are : [12, 14, 15, 20, 16]
 * Explanation 2:
 *  Nodes which are in range [2, 20] are : [8, 6, 7]
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
public class CountBSTNodesInRange {
    public int solve(TreeNode A, int B, int C) {
        return findCount(A, B, C);
    }

    public static int findCount(TreeNode A, int B, int C) {
        if (A == null) {
            return 0;
        }
        int currentValue = A.val;
        if (B > currentValue) {
            return findCount(A.right, B, C);
        } else if (C < currentValue) {
            return findCount(A.left, B, C);
        } else {
            return 1 + findCount(A.right, B, C) + findCount(A.left, B, C);
        }
    }
}
