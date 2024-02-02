package heaps;

import java.util.*;

public class FrequencySort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 1, 4, 2, 2};
        System.out.println(frequencySort(arr));
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

    private static List<Integer> frequencySort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        // since we want highest frequency element first, so we have called reversed
        // we have called reversed to ensure we get the max heap order
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getFrequency).reversed());

        Map<Integer, Integer> freqMap = new HashMap<>();

        // prepare the frequency map
        for (int ele : arr) {
            freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
        }

        // since we want all the elements back and want to do sorting on basis of frequency
        // so we will not have any logic for removal
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        // while the pq is not empty
        while (!pq.isEmpty()) {
            Pair pair = pq.remove();
            int freq = pair.getFrequency();
            while (freq-- > 0) {
                result.add(pair.getElement());
            }
        }

        // finally return the result
        return result;
    }
}
