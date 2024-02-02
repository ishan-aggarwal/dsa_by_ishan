package heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestElementsInArray {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 1, 3};
        int k = 3;
        System.out.println(kLargestElementsInArray(arr, k));
    }

    // when we want to return remaining largest elements
    // then we will create min heap
    private static List<Integer> kLargestElementsInArray(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        // is used to create min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int ele : arr) {
            pq.add(ele);
            while (pq.size() > k) {
                pq.remove();
            }
        }

        // remove elements from priority queue and add it to result
        while (!pq.isEmpty()) {
            result.add(pq.remove());
        }

        // return result
        return result;
    }
}
