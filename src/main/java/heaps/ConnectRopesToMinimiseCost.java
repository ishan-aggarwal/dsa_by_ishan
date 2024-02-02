package heaps;

import java.util.PriorityQueue;

public class ConnectRopesToMinimiseCost {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(connectRopesToMinimiseCost(arr));
    }

    private static int connectRopesToMinimiseCost(int[] arr) {
        int totalCost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
        }

        if (pq.size() == 1) {
            return pq.remove();
        }

        // 1,2,3,4,5
        // tC = 3
        // 3,3,4,5
        // tc = 3+6
        // 4,5,6
        // tc = 3+6+9
        // 6,9
        // tc = 3+6+9+15
        // 15
        while (pq.size() >= 2) {
            int first = pq.remove();
            int second = pq.remove();
            totalCost += first + second;
            pq.add(first + second);
        }

        return totalCost;
    }
}
