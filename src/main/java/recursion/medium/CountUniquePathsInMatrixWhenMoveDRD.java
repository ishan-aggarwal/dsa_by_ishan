package recursion.medium;

// CountUniquePathsInMatrixWhenMoveDRD when we can move down or right or diagonally down only
public class CountUniquePathsInMatrixWhenMoveDRD {

    public static void main(String[] args) {
        int N = 3, M = 3;
        int totalWays = countUniquePathsWhenMoveDRDIsAllowed(0, 0, N, M);
        System.out.println(totalWays);
    }

    private static int countUniquePathsWhenMoveDRDIsAllowed(int r, int c, int n, int m) {

        // if we are standing in last row or last column.. then we only have once choice left
        // so we will simply return the count of paths as 1.
        if (r == n - 1 || c == m - 1) {
            return 1;
        }

        // otherwise we have three possibilities;
        // we can move down by doing (r+1,c)
        int downWays = countUniquePathsWhenMoveDRDIsAllowed(r + 1, c, n, m);
        // we can move right by doing (r,c+1)
        int rightWays = countUniquePathsWhenMoveDRDIsAllowed(r, c + 1, n, m);
        // we can move down diagonally by doing (r+1, c+1)
        int diagonalWays = countUniquePathsWhenMoveDRDIsAllowed(r + 1, c + 1, n, m);

        // finally, we can return the total number of ways by adding all of the above
        return downWays + rightWays + diagonalWays;

    }
}
