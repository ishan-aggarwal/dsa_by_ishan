package heaps;

import java.util.*;

public class KClosestPointsToOrigin {

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;
        List<int[]> result = getKClosestPointsToOrigin(arr, k);
        for (int[] point : result) {
            System.out.println(Arrays.toString(point));
        }
    }

    private static List<int[]> getKClosestPointsToOrigin(int[][] arr, int k) {
        List<int[]> result = new ArrayList<>();
        // since we need closest -> so we need to remove the one's that have more distance
        // as we can keep max k close points
        // so we will have reversed called
        PriorityQueue<PointDistance> pq = new PriorityQueue<>(Comparator.comparingDouble(PointDistance::getDistance).reversed());

        for (int[] point : arr) {
            int x = point[0];
            int y = point[1];
            // since it is origin -> so we are subtracting (0,0)
            double distanceFromOrigin = Math.pow((x - 0), 2) + Math.pow((y - 0), 2);

            pq.add(new PointDistance(point, distanceFromOrigin));

            // as we can only keep max k close points
            while (pq.size() > k) {
                pq.remove();
            }
        }

        while (!pq.isEmpty()) {
            PointDistance pointDistance = pq.remove();
            result.add(pointDistance.getPoint());
        }
        return result;
    }

    static class PointDistance {
        int[] point;
        double distance;

        public PointDistance(int[] point, double distance) {
            this.point = point;
            this.distance = distance;
        }

        public int[] getPoint() {
            return this.point;
        }

        public double getDistance() {
            return this.distance;
        }
    }
}
