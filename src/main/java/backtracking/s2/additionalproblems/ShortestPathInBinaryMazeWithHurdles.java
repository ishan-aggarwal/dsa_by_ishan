package backtracking.s2.additionalproblems;

import java.util.ArrayList;
import java.util.List;

/**
 * Q2. Shortest path in a Binary Maze with Hurdles
 * Problem Description
 * <p>
 * Given an MxN matrix where each element can either be 0 or 1. We need to find the length of shortest path between a given source cell to a destination cell.
 * A cell with value 0 denotes that it's a hurdle. The path can only be created out of the cells with values 1.
 * If NO path exists then print -1.
 * The matrix A is given as input of size M x N.
 * The coordinates of Source cell are given by B, C.
 * The coordinates of Destination cell are given by D, E.
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= N , M <= 8
 * 0 <= A[i][j] <= 1
 * 0 <= B, C < N
 * 0 <= D, E < M
 * A[B][C] == A[D][E] == 1
 * <p>
 * Input Format
 * <p>
 * First Argument is a 2-D Integer Array denotes the matrix A, of size MxN.
 * Second Argument is an Integer B, denoting the Source Row Index
 * Third Argument is an Integer C, denoting the Source Column Index
 * Fourth Argument is an Integer D, denoting the Destination Row Index
 * Fifth Argument is an Integer E, denoting the Destination Column Index
 * <p>
 * <p>
 * Output Format
 * <p>
 * Output a single integer denoting the length of the minimum distance from Source to destination
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1 :
 * A = [[1, 1, 0, 0],
 * [0, 1, 1, 0],
 * [0, 0, 1, 1],
 * [0, 0, 0, 1]]
 * B = 0, C = 0
 * D = 3, E = 3
 * Input 2 :
 * A = [[1, 1, 1],
 * [1, 0, 1],
 * [1, 1, 1]]
 * B = 0, C = 0
 * D = 0, E = 2
 * Input 3 :
 * A = [[1, 0, 1],
 * [1, 0, 1],
 * [1, 0, 1]]
 * B = 0, C = 0
 * D = 0, E = 2
 * <p>
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1 :
 * 6
 * Output 2 :
 * 2
 * Output 3 :
 * -1
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * For Input 1 :
 * The shortest path is (0,0) -> (0,1) -> (1,1) -> (1,2) -> (2,2) -> (2,3) -> (3,3)
 * For Input 2 :
 * The shortest path is (0,0) -> (0,1) -> (0,2)
 * For Input 3 :
 * No path exists so we return -1
 */

public class ShortestPathInBinaryMazeWithHurdles {

    private int ans;
    private int rows;
    private int cols;

    public static void main(String[] args) {
        ShortestPathInBinaryMazeWithHurdles obj = new ShortestPathInBinaryMazeWithHurdles();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(List.of(1, 1, 0, 0)));
        A.add(new ArrayList<>(List.of(0, 1, 1, 0)));
        A.add(new ArrayList<>(List.of(0, 0, 1, 1)));
        A.add(new ArrayList<>(List.of(0, 0, 0, 1)));
        int B = 0, C = 0;
        int D = 3, E = 3;
        int shortestPath = obj.findShortestPath(A, B, C, D, E);
        System.out.println(shortestPath);
    }

    public int findShortestPath(ArrayList<ArrayList<Integer>> A, int B, int C, int D, int E) {

        ans = Integer.MAX_VALUE;
        rows = A.size();
        cols = A.get(0).size();

        boolean[][] visited = new boolean[rows][cols];
        findShortestPath(A, B, C, D, E, visited, 0);
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }


    private void findShortestPath(ArrayList<ArrayList<Integer>> A, int sr, int sc,
                                  int dr, int dc, boolean[][] visited, int length) {

        // check for boundary conditions
        if (sr < 0 || sr >= rows || sc < 0 || sc >= cols
                || A.get(sr).get(sc) == 0
                || visited[sr][sc]) {
            return;
        }

        // base condition
        if (sr == dr && sc == dc) {
            ans = Math.min(ans, length);
            return;
        }

        // do step
        // mark visited
        visited[sr][sc] = true;

        // down
        findShortestPath(A, sr + 1, sc, dr, dc, visited, length + 1);
        // right
        findShortestPath(A, sr, sc + 1, dr, dc, visited, length + 1);
        // left
        findShortestPath(A, sr, sc - 1, dr, dc, visited, length + 1);
        // up
        findShortestPath(A, sr - 1, sc, dr, dc, visited, length + 1);

        // undo step
        // mark not-visited
        visited[sr][sc] = false;
    }
}
