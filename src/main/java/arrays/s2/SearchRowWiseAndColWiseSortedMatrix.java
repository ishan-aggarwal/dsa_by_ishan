package arrays.s2;

// https://leetcode.com/problems/search-a-2d-matrix/
// TC - O(n + m) and SC - O(1)
public class SearchRowWiseAndColWiseSortedMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int r = 0, c = m - 1;
        while (r < n && c >= 0) {
            int element = matrix[r][c];
            if (element == target) {
                return true;
            }
            if (element > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}
