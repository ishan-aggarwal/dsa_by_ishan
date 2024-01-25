package recursion.medium;

public class PrintUniquePathsInMatrix {
    public static void main(String[] args) {
        int N = 3, M = 3;
        printUniquePaths(0, 0, N, M, "");
    }

    private static void printUniquePaths(int r, int c, int n, int m, String path) {
        // if I am standing at the bottom right cell (i.e. last row, and col)
        // then print whatever we have in the path for now
        if (r == n - 1 && c == m - 1) {
            System.out.println(path);
            return;
        }

        // we will directly update the path in the function call itself instead of taking in a temp variable
        if (r < n - 1) {
            printUniquePaths(r + 1, c, n, m, path + "D");
        }

        // we will directly update the path in the function call itself instead of taking in a temp variable
        if (c < m - 1) {
            printUniquePaths(r, c + 1, n, m, path + "R");
        }
    }
}
