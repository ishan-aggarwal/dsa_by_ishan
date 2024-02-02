package heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 1, 3};
        int k = 2;
        System.out.println(kthSmallestElement(arr, k));
    }

    // we will have a maximum heap and start adding elements to it
    // in case we have more than k elements added to the heap at any point of time
    // we can safely remove the topmost element from the heap as it will not fall under kth small elements
    private static int kthSmallestElement(int[] arr, int k) {

        // To ensure we are making a max heap - Collections.reverseOrder()
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr) {
            pq.add(ele);

            while (pq.size() > k) {
                pq.remove();
            }
        }
        return pq.isEmpty() ? -1 : pq.peek();
    }
}
