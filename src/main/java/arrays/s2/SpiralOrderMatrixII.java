package arrays.s2;

import java.util.Arrays;

/**
 * Q1. Spiral Order Matrix II
 * Problem Description
 * Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
 * <p>
 * Problem Constraints
 * 1 <= A <= 1000
 * <p>
 * Input Format
 * First and only argument is integer A
 * Output Format
 * Return a 2-D matrix which consists of the elements added in spiral order.
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * 1
 * Input 2:
 * 2
 * Input 3:
 * 5
 * <p>
 * Example Output
 * Output 1:
 * [ [1] ]
 * Output 2:
 * [ [1, 2],
 * [4, 3] ]
 * Output 3:
 * [ [1,   2,  3,  4, 5],
 * [16, 17, 18, 19, 6],
 * [15, 24, 25, 20, 7],
 * [14, 23, 22, 21, 8],
 * [13, 12, 11, 10, 9] ]
 * <p>
 * Example Explanation
 * Explanation 1:
 * Only 1 is to be arranged.
 */

public class SpiralOrderMatrixII {
    public static int[][] generateMatrix(int A) {
        int[][] matrix = new int[A][A];
        int value = 1;

        int left = 0;
        int right = A - 1;
        int top = 0;
        int bottom = A - 1;

        while (left <= right && top <= bottom) {

            for (int j = left; j <= right; j++) {
                matrix[top][j] = value;
                value++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value;
                value++;
            }
            right--;

            for (int j = right; j >= left; j--) {
                matrix[bottom][j] = value;
                value++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value;
                value++;
            }
            left++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] result = generateMatrix(2);
        System.out.println(Arrays.deepToString(result));
    }
}
