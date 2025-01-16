package trees.s1;

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

/**
 * Q4. Equal Tree Partition
 *
 * Problem Description
 * Given a binary tree A. Check whether it is possible to partition the tree to two trees which have equal sum of values after removing exactly one edge on the original tree.
 *
 * Problem Constraints
 * 1 <= size of tree <= 100000
 * 0 <= value of node <= 109
 *
 * Input Format
 * First and only argument is head of tree A.
 *
 * Output Format
 * Return 1 if the tree can be partitioned into two trees of equal sum else return 0.
 *
 * Example Input
 * Input 1:
 *
 *
 *                 5
 *                /  \
 *               3    7
 *              / \  / \
 *             4  6  5  6
 * Input 2:
 *
 *                 1
 *                / \
 *               2   10
 *                   / \
 *                  20  2
 *
 *
 * Example Output
 *
 * Output 1:
 *  1
 * Output 2:
 *  0
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *  Remove edge between 5(root node) and 7:
 *         Tree 1 =                                               Tree 2 =
 *                         5                                                     7
 *                        /                                                     / \
 *                       3                                                     5   6
 *                      / \
 *                     4   6
 *         Sum of Tree 1 = Sum of Tree 2 = 18
 * Explanation 2:
 *  The given Tree cannot be partitioned.
 */

// TC - O(N^2) and SC - O(H)
public class EqualTreePartition {
    public int solve(TreeNode A) {
        long sum = sum(A);
        if (sum % 2 == 1) {
            return 0;
        }
        long halfSum = sum / 2;
        return hasEqualSum(A, halfSum) ? 1 : 0;
    }

    private static long sum(TreeNode A) {
        if (A == null) return 0;
        return A.val + sum(A.left) + sum(A.right);
    }

    private static boolean hasEqualSum(TreeNode A, long need) {
        if (A == null) {
            return false;
        }

        long leftSum = sum(A.left);
        if (leftSum == need) return true;

        long rightSum = sum(A.right);
        if (rightSum == need) return true;

        return hasEqualSum(A.left, need) || hasEqualSum(A.right, need);
    }
}
