package trees.s2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public TreeNode buildTree(int[] A, int[] B) {
        int n = A.length;
        Map<Integer, Integer> elementIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            elementIndexMap.put(A[i], i);
        }

        TreeNode root = new TreeNode(B[n - 1]);
        int rootPos = elementIndexMap.get(B[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            solve(B[i], root, rootPos, elementIndexMap);
        }
        return root;
    }

    private void solve(int ele, TreeNode root, int rootPos, Map<Integer, Integer> elementIndexMap) {
        int elementIndex = elementIndexMap.get(ele);
        TreeNode node = new TreeNode(ele);
        if (elementIndex > rootPos) {
            root.right = node;
        } else {
            root.left = node;
        }
    }

    public static void main(String[] args) {
//        int[] A = {2, 1, 3};
//        int[] B = {2, 3, 1};
//        Solution res = new Solution();
//        TreeNode treeNode = res.buildTree(A, B);
//        System.out.println("-------");


        int[] A1 = {6, 1, 3, 2};
        int[] B1 = {6, 3, 2, 1};
        Solution object = new Solution();
        TreeNode treeNode1 = object.buildTree(A1, B1);
        System.out.println("-------");
    }
}
