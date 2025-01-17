package arrays.intermediate.c1;

public class RotateArray {
    public int[] solve(int[] A, int B) {
        int n = A.length;
        B = B % n;
        reverse(A, 0, n - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, n - 1);
        return A;
    }

    private static void reverse(int[] a, int s, int e) {
        int l = s;
        int r = e;
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}
