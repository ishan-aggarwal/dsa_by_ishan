package graphs.aditya_verma_series;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class _5BFSMinimumKnightMoves {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int minKnightMoves(int x, int y) {

        // there are 4 quadrants
        // a very good improvement could be to make x and y positive
        // then we can only move in top right quadrant
        x = Math.abs(x);
        y = Math.abs(y);

        int[] xDir = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] yDir = {-1, 1, -2, 2, -2, 2, -1, 1};
        int moves = 0;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));

        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point current = queue.poll();
                if (current.x == x && current.y == y) {
                    return moves;
                }

                for (int j = 0; j < xDir.length; j++) {
                    int newX = current.x + xDir[j];
                    int newY = current.y + yDir[j];
                    String s = newX + "," + newY;
                    // this is for that movement in top right quadrant
                    // if we make our destination coordinates positive
//                    if (!visited.contains(s) && newX >= 0 && newY >= 0) {
                    if (!visited.contains(s)) {
                        queue.add(new Point(newX, newY));
                        visited.add(s);
                    }
                }
            }
            moves++;
        }
        // If no path exists
        return -1;
    }
}