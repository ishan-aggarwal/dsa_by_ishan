package dynamic_programming.oneD;

// https://leetcode.com/problems/climbing-stairs/description/

import java.util.Arrays;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    public static int climbStairsRecursive(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

    public static int climbStairsMemoization(int n, int[] dp) {
        if (n <= 1) return 1;
        if (n == 2) return 2;

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = climbStairsMemoization(n - 1, dp) + climbStairsMemoization(n - 2, dp);
    }

    public static int climbStairsTopDown(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int climbStairsTopDownSpaceOptimized(int n) {
        // we are interested in total 3 states
        int prev2 = 1;
        int prev = 1;
        int curr = 0;

        if (n <= 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return curr;
    }


    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairsRecursive(n));

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(climbStairsMemoization(n, dp));

        System.out.println(climbStairsTopDown(n));

        System.out.println(climbStairsTopDownSpaceOptimized(n));
    }
}
