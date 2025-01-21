package trees.s3.additionalproblems;

import trees.s1.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Q1. Two Sum BST
 *
 * Problem Description
 * Given a binary search tree A, where each node contains a positive integer, and an integer B, you have to find whether or not there exist two different nodes X and Y such that X.value + Y.value = B.
 * Return 1 to denote that two such nodes exist. Return 0, otherwise.
 *
 * Problem Constraints
 * 1 <= size of tree <= 100000
 * 1 <= B <= 109
 *
 * Input Format
 * First argument is the head of the tree A.
 * Second argument is the integer B.
 *
 * Output Format
 * Return 1 if such a pair can be found, 0 otherwise.
 *
 * Example Input
 * Input 1:
 *
 *          10
 *          / \
 *         9   20
 *
 * B = 19
 * Input 2:
 *
 *
 *           10
 *          / \
 *         9   20
 *
 * B = 40
 *
 * Example Output
 * Output 1:
 *  1
 * Output 2:
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *  10 + 9 = 19. Hence 1 is returned.
 * Explanation 2:
 *  No such pair exists.
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
public class TwoSumBST {
    public int t2Sum(TreeNode A, int B) {
        Set<Integer> set = new HashSet<>();
        return findAns(A, set, B) ? 1 : 0;
    }

    public static boolean findAns(TreeNode A, Set<Integer> set, int B) {
        if (A == null) {
            return false;
        }
        if (set.contains(B - A.val)) {
            return true;
        }
        set.add(A.val);
        return findAns(A.left, set, B) || findAns(A.right, set, B);
    }
}
