package recursion.medium;

// https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/
// CountUniquePathsInMatrix when we can move down and right only
public class CountUniquePathsInMatrix {
    public static void main(String[] args) {
        int N = 3, M = 3;
        int totalWays = countUniquePaths(0, 0, N, M);
        System.out.println(totalWays);
    }

    // m rows and n cols
    private static int countUniquePaths(int r, int c, int rows, int cols) {

        // if we are standing in the last row -> then we can only move right irrespective of the column number -> so only 1 solution possible
        // if we are standing in the last col -> then we can only move down irrespective of the row number -> so only 1 solution possible
        if (r == rows - 1 || c == cols - 1) {
            return 1;
        }

        // otherwise we have two choices to perform move down (r+1, c) or
        // move right which is (r, c+1)
        // and we want to return sum of both the available choices
        return countUniquePaths(r + 1, c, rows, cols) + countUniquePaths(r, c + 1, rows, cols);
    }
}
