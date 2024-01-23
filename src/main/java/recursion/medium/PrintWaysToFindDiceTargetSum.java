package recursion.medium;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/count-ways-to-obtain-given-sum-by-repeated-throws-of-a-dice/
public class PrintWaysToFindDiceTargetSum {
    private static int totalWays = 0;

    public static void main(String[] args) {
        int n = 3;
        countWays(n);
        System.out.println("Total ways to form sum: " + n + " are: " + totalWays);
        System.out.println("-----------------");
        List<String> possibleWays = printWays(n);
        System.out.println(possibleWays);
    }

    private static List<String> printWays(int n) {
        List<String> result = new ArrayList<>();
        calc(n, "", result);
        return result;
    }

    private static void calc(int target, String output, List<String> result) {
        if (target == 0) {
            result.add(output);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            calc(target - i, output + i, result);
        }
    }

    private static void countWays(int n) {
        // base condition
        // basically if our target sum becomes zero
        // it means that we achieved one possible way
        // we can increase the totalWays by 1
        if (n == 0) {
            totalWays += 1;
        }
        // now in order to try out all the combinations
        // there are 6 possible choices and max dice roll value that we can use
        // should be less than the current available targetSum (which is n in this case)
        // now we will call the recursive function with (n-i)
        for (int i = 1; i <= 6 && i <= n; i++) {
            countWays(n - i);
        }
    }
}
