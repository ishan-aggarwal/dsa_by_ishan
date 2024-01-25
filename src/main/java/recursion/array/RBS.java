package recursion.array;

public class RBS {
    public static void main(String[] args) {
        int key = 60;
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(rbs(arr1, 0, arr1.length - 1, key));
        int[] arr2 = {40, 50, 60, 70, 80, 10, 20, 30};
        System.out.println(rbs(arr2, 0, arr2.length - 1, key));
        int[] arr3 = {80, 10, 20, 30, 40, 50, 60, 70};
        System.out.println(rbs(arr3, 0, arr3.length - 1, key));
    }

    private static int rbs(int[] arr, int s, int e, int key) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        // if the key is found at the mid position, return mid
        if (arr[mid] == key) {
            return mid;
        }

        // now the possibilities are the first half is sorted
        // check this as very first condition
        if (arr[s] <= arr[mid]) {
            // if it is sorted and key is also present in between [s,mid)
            // then we will change our end to mid - 1
            if (key >= arr[s] && key <= arr[mid]) {
                return rbs(arr, s, mid - 1, key);
            } else {
                // otherwise if the key is not present in this half
                // then it should be present in the other half
                // which is (mid, e]
                // so we will change our start to mid + 1
                return rbs(arr, mid + 1, e, key);
            }
        } else if (key >= arr[mid] && key <= arr[e]) {
            // now in case the key is not present here then
            // key should be checked if it is in between [mid, e]
            // if that is the case then we should update our start -> mid+1
            return rbs(arr, mid + 1, e, key);
        } else {
            // otherwise, we should change our end to mid - 1
            return rbs(arr, s, mid - 1, key);
        }
    }
}
