package search.linear;

// TC - O(N) and SC - O(1)
public class LinearSearch {

    public static int search(int[] arr, int k) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == k) {
                return idx;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 6, 8, 1, -9, 7};
        System.out.println(search(arr, 8));
        System.out.println(search(arr, 0));
    }
}
