package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int n = arr.length;

        // Traverse the array and move non-zero elements to the front
        int nonZeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the first zero or non-zero element
                int temp = arr[i];
                arr[i] = arr[nonZeroCount];
                arr[nonZeroCount] = temp;

                // Increment count of non-zero elements
                nonZeroCount++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println("Original Array: " + Arrays.toString(arr));

        moveZeros(arr);

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }
}
