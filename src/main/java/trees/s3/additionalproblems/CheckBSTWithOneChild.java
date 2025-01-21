package trees.s3.additionalproblems;

public class CheckBSTWithOneChild {
    public String solve(int[] A) {
        int l = Integer.MIN_VALUE;
        int r = Integer.MAX_VALUE;
        int root = A[0]; // 4
        for (int i = 1; i < A.length; i++) {
            if (A[i] > root) {
                l = root; // 4
            } else {
                r = root;
            }
            if (A[i] < l || A[i] > r) {
                return "NO";
            }
            root = A[i];  // 10
        }
        return "YES";
    }

    public String solve1(int[] A) {
        int l = Integer.MIN_VALUE;
        int r = Integer.MAX_VALUE;
        int root = A[0]; // 4
        int n = A.length;
        if (n <= 2) {
            return "YES";
        }
        return isValidBST(A, 1, root, l, r) ? "YES" : "NO";
    }

    public static boolean isValidBST(int[] A, int idx, int root, int l, int r) {
        if (idx == A.length) {
            return true;
        }
        int curr = A[idx];
        if (curr > root) {
            l = root;
        } else {
            r = root;
        }
        if (curr < l || curr > r) {
            return false;
        }
        return isValidBST(A, idx + 1, curr, l, r);
    }

    public static void main(String[] args) {
        CheckBSTWithOneChild solution = new CheckBSTWithOneChild();
        int[] A = {4, 10, 5, 8};
        System.out.println(solution.solve(A));
        System.out.println(solution.solve1(A));
    }
}
