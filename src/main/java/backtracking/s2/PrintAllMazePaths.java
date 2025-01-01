package backtracking.s2;

import java.util.ArrayList;

/**
 * Q3. Print All Maze Paths
 * Problem Description
 * You are given the dimensions of a rectangular board of size A x B. You need to print all the possible paths from top-left corner to bottom-right corner of the board.
 * You can only move down (denoted by 'D') or right (denoted by 'R') at any point in time.
 * NOTE : You need to return all the paths in Lexicographically sorted order. A lexicographic order is an arrangement of characters in alphabetical order.
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= A, B <= 8
 * <p>
 * Input Format
 * <p>
 * First Argument is an Integer A, which denotes the Row Index.
 * Second Argument is an Integer B, which denotes the Column Index.
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return a String Array, which denotes all the possible paths in separate lines. The paths should be returned in the Lexicographical order.
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1 :
 * A = 3 , B = 2
 * Input 2 :
 * A = 1 , B = 2
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1 :
 * DDR DRD RDD
 * Output 2 :
 * R
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * For Input 1 :
 * The size of the matrix is 3x2.
 * You are currently standing at (0, 0), the possible paths to bottom right cell (2, 1) are :
 * - (0, 0) -> (1, 0) -> (2, 0) -> (2, 1)  which corresponds to DDR
 * - (0, 0) -> (1, 0) -> (1, 1) -> (2, 1)  which corresponds to DRD
 * - (0, 0) -> (0, 1) -> (1, 1) -> (2, 1)  which corresponds to RDD
 * <p>
 * NOTE: Printing DRD, RDD before DDR would be incorrect as the output should be given in Lexicographical order.
 * For Input 2 :
 * The size of the matrix is 1x2.
 * You are currently standing at (0, 0), the possible paths to bottom right cell (0, 1) are :
 * - (0, 0) -> (0, 1)  which corresponds to R
 * <p>
 * This is the only possible path.
 */

public class PrintAllMazePaths {

    public static void main(String[] args) {
        ArrayList<String> ans = printAllPaths(3, 2);
        System.out.println(ans);
    }

    public static ArrayList<String> printAllPaths(int A, int B) {
        ArrayList<String> ans = new ArrayList<>();
        // call the helper function
        allPaths(0, 0, "", ans, A - 1, B - 1);
        return ans;
    }

    private static void allPaths(int sr, int sc, String currentPath, ArrayList<String> ans, int dr, int dc) {
        // base condition
        // if I have reached the destination
        if (sr == dr && sc == dc) {
            ans.add(currentPath);
            return;
        }

        // in case I have reached out of bounds of matrix given to us
        if (sr > dr || sc > dc) {
            return;
        }

        // actual logic
        // move down
        allPaths(sr + 1, sc, currentPath + "D", ans, dr, dc);

        // move right
        allPaths(sr, sc + 1, currentPath + "R", ans, dr, dc);
    }
}
