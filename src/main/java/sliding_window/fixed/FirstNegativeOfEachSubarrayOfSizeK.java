package sliding_window.fixed;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/first-negative-integer-every-window-size-k/
// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class FirstNegativeOfEachSubarrayOfSizeK {


    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        System.out.println(fistNegativeElementOfEachWindowOfSizeK(arr, k));
    }

    private static List<Integer> fistNegativeElementOfEachWindowOfSizeK(int[] arr, int k) {
        // this is used to hold the final answer
        List<Integer> ans = new ArrayList<>();

        // this is a list used to maintain the negative elements with in the current ongoing window
        List<Integer> current = new ArrayList<>();

        // initialize both start and end of the windows
        int i = 0, j = 0;

        // we need to iterate over the entire array
        while (j < arr.length) {

            // perform calculations
            // if the element is negative then it should be maintained in current negative window list
            if (arr[j] < 0) {
                current.add(arr[j]);
            }

            // see if the window size is not yet reached, then expand the window
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) { // otherwise if the window size is reached, then slide the window

                // if no negative element is found so far in the window then current list would be empty and add 0 to the solution
                if (current.isEmpty()) {
                    ans.add(0);
                } else {
                    // otherwise add the first element of current list to ans
                    ans.add(current.get(0));
                }

                // if current is not empty and left element of the window is same as first element of current list remove it
                if (!current.isEmpty() && arr[i] == current.get(0)) {
                    current.remove(0);
                }

                // slide the window
                i++;
                j++;
            }

        }

        // finally return the answer
        return ans;
    }
}
