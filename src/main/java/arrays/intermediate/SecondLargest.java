package arrays.intermediate;

public class SecondLargest {
    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for (int ele : A) {
            if (ele > max) {
                sMax = max;
                max = ele;
            } else if (ele > sMax && ele != max) {
                sMax = ele;
            }
        }
        return sMax == Integer.MIN_VALUE ? -1 : sMax;
    }
}
