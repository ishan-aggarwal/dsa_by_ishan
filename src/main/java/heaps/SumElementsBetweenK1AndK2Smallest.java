package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class SumElementsBetweenK1AndK2Smallest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 12, 5, 15, 11};
        int k1 = 3;
        int k2 = 6;

        int k1thSmallestElement = findKthSmallest(arr, k1);
        int k2thSmallestElement = findKthSmallest(arr, k2);

        if (k1thSmallestElement == -1 || k2thSmallestElement == -1) {
            throw new RuntimeException("Input is not valid");
        }

        int answer = 0;
        for (int ele : arr) {
            if (ele > k1thSmallestElement && ele < k2thSmallestElement) {
                answer += ele;
            }
        }

        System.out.println(answer);
    }

    private static int findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr) {
            pq.add(ele);
            while (pq.size() > k) {
                pq.remove();
            }
        }
        return pq.isEmpty() ? -1 : pq.peek();
    }
}
