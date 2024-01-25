package recursion.array;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(sorted(arr, 0));

        int[] arr1 = {1, 2, 3, 40, 5, 6, 70};
        System.out.println(sorted(arr1, 0));
    }

    private static boolean sorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        return arr[idx] <= arr[idx + 1] && sorted(arr, idx + 1);
    }
}
