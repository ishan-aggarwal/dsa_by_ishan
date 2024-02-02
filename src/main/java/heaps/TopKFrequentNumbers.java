package heaps;

import java.util.*;

public class TopKFrequentNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 2, 2, 4};
        int k = 2;
        System.out.println(topKFrequentNumbers(arr, k));
    }

    static class Pair {
        int element;
        int frequency;

        public Pair(int element, int frequency) {
            this.element = element;
            this.frequency = frequency;
        }

        public int getElement() {
            return this.element;
        }

        public int getFrequency() {
            return this.frequency;
        }
    }

    private static List<Integer> topKFrequentNumbers(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        // prepare the frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int ele : arr) {
            freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
        }

        // here we want to have min heap the reason is we want to keep the highest frequency elements
        // and want to remove the elements with low frequency
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getFrequency));

        // iterate over the map
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));

            // remove the elements from pq if the size is more than k
            while (pq.size() > k) {
                pq.remove();
            }
        }

        // empty the pq and add the original elements to result list
        while (!pq.isEmpty()) {
            Pair pair = pq.remove();
            result.add(pair.getElement());
        }
        // just to have the highest frequency element printed first
        Collections.reverse(result);
        // finally return the result
        return result;
    }
}
