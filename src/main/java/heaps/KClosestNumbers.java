package heaps;

import java.util.*;

public class KClosestNumbers {

    static class Pair {
        int element;
        int absoluteDifference;

        public Pair(int element, int absoluteDifference) {
            this.element = element;
            this.absoluteDifference = absoluteDifference;
        }

        public int getAbsoluteDifference() {
            return absoluteDifference;
        }

        public int getElement() {
            return element;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        int k = 3;
        int x = 7;
        System.out.println(kClosestNumbers(arr, k, x));
    }

    private static List<Integer> kClosestNumbers(int[] arr, int k, int x) {

        List<Integer> result = new ArrayList<>();

        // we need to remove elements from pq which have bigger difference
        // and the priority queue should work on absolute difference
        // so we are using the field Comparator.comparingInt(Pair::getAbsoluteDifference)
        // and since we want the max difference to be at top
        // so we have called reversed method also on it
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getAbsoluteDifference).reversed());

        for (int ele : arr) {
            int absoluteDiff = Math.abs(ele - x);
            pq.add(new Pair(ele, absoluteDiff));

            // it means we have got k nearest elements already in the priority queue
            // that will help to get to the answer
            while (pq.size() > k) {
                pq.remove();
            }
        }

        // finally get the k closest numbers to k by removing from PQ and adding them back to the result list
        while (!pq.isEmpty()) {
            Pair currentPair = pq.remove();
            result.add(currentPair.getElement());
        }

        return result;
    }
}
