package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndSecondLargest {

    public static Pair findFirstAndSecondLargest(List<Integer> list) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int current : list) {
            if (current > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = current;
            } else if (current > secondLargest && current != firstLargest) {
                // have this extra check in case the first and second largest can not be same
                secondLargest = current;
            }
        }

        return new Pair(firstLargest, secondLargest);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(findFirstAndSecondLargest(list));
    }

    static class Pair {
        int firstLargest;
        int secondLargest;

        public Pair(int firstLargest, int secondLargest) {
            this.firstLargest = firstLargest;
            this.secondLargest = secondLargest;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "firstLargest=" + firstLargest +
                    ", secondLargest=" + secondLargest +
                    '}';
        }
    }
}
