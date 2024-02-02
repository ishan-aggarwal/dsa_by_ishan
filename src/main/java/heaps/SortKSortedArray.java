package heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void main(String[] args) {
        //           0  1  2  3  4   5  6
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        // the important property to note here is that each element is atmost k distance apart from its correct position
        // in case the input is not correct - then we will not get the correct answer in the output
        System.out.println(sortKSortedArray(arr, k));
    }

    // since I want to sort the array in ascending order
    // it is important to note that we should have the minimum element removed first
    // that is possible when we will have a min heap
    // O(n * log k)
    private static List<Integer> sortKSortedArray(int[] arr, int k) {
        List<Integer> sortedList = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);

            while (pq.size() > k) {
                sortedList.add(pq.remove());
            }
        }

        // while the priority queue is not empty, remove the elements from the pq in order and add to the sortedList
        while (!pq.isEmpty()) {
            sortedList.add(pq.remove());
        }

        return sortedList;
    }
}
