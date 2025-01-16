package arrays.s2;

import java.util.Arrays;

public class SpiralOrderMatrixI {

    private static void printSpiralOrder(int[][] mat) {
        int n = mat.length;
        int r = 0, c = 0;
        while (n > 0) {
            printBoundary(mat, n, r, c);
            r++;
            c++;
            n = n - 2;
            System.out.println();
        }
    }

    // TC - O(N) and SC - O(1)
    private static void printBoundary(int[][] mat, int n, int r, int c) {

        // print (n - 1) elements in top row
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(mat[r][c] + " ");
            c++;
        }

        // print (n - 1) elements in last column
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(mat[r][c] + " ");
            r++;
        }

        // print (n - 1) elements in last row
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(mat[r][c] + " ");
            c--;
        }

        // print (n - 1) elements in first col
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(mat[r][c] + " ");
            r--;
        }

        // edge case
        if (n == 1) {
            System.out.print(mat[r][c] + " ");
        }

    }

    public static void main(String[] args) {
        int size = 5;
        int[][] mat = new int[size][size];

        int val = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = val;
                val++;
            }
        }

        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }


        printSpiralOrder(mat);
    }
}
