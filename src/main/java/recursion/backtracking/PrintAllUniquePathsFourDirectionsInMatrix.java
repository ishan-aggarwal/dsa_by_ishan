package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAllUniquePathsFourDirectionsInMatrix {
    public static void main(String[] args) {
        int n = 3, m = 3;

        boolean[][] visited = new boolean[n][m];

        List<String> answer = new ArrayList<>();
        printAllPathsFourDirections(0, 0, n, m, "", answer, visited);
        System.out.println(answer);
    }

    private static void printAllPathsFourDirections(int i, int j, int n, int m, String path, List<String> answer, boolean[][] visited) {

        if (i == n - 1 && j == m - 1) {
            answer.add(path);
            return;
        }

        // invalid cell - no need to check as we are already putting conditions everywhere
//        if (i < 0 || i >= n || j < 0 || j >= m) {
//            return;
//        }

        // if the cell is already visited then we should return immediately
        if (visited[i][j]) return;

        // mark the cell as visited
        visited[i][j] = true;

        // valid cell -> we can move in the next row (down direction)
        if (i < n - 1) {
            printAllPathsFourDirections(i + 1, j, n, m, path + "D", answer, visited);
        }
        // valid cell -> we can move it the next col (right direction)
        if (j < m - 1) {
            printAllPathsFourDirections(i, j + 1, n, m, path + "R", answer, visited);
        }
        // valid cell -> we can move in the previous row (with the direction Up)
        if (i > 0) {
            printAllPathsFourDirections(i - 1, j, n, m, path + "U", answer, visited);
        }

        // valid cell -> we can move in the previous column (with the direction as left)
        if (j > 0) {
            printAllPathsFourDirections(i, j - 1, n, m, path + "L", answer, visited);
        }

        // finally update the cell so that it can be used to calcualte any other possible paths
        visited[i][j] = false;
    }
}
