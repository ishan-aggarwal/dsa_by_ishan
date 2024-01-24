package recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutationsOfNNumbersToFindGivenSum {

    public static void main(String[] args) {
        int N = 2;
        int sum = 4;
        List<List<Integer>> result = printWays(N, sum);
        result.forEach(System.out::println);
    }

    private static List<List<Integer>> printWays(int N, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        calc(N, sum, current, result);
        return result;
    }

    private static void calc(int size, int targetSum, List<Integer> current, List<List<Integer>> result) {

        // base condition where we have found the solution
        // when both size and targetSum have become zero
        // add this to our answer
        if (size == 0 && targetSum == 0) {
            // when we come here - it means we have found one solution
            // and we will add it to the result list
            result.add(new ArrayList<>(current));
            // when we will return from here - this would be the case that we
            //  will execute the line current.remove(current.size() - 1);
            // and then it will go up the loop and see the loop is complete...
            // and then again it will execute the line current.remove(current.size() - 1);
            // and go up the loop to start from a different value of i
            return;
        }

        // if the size has reached zero or negative - but targetSum is still not zero
        // we would like to return w/o doing anything
        if (size <= 0) {
            // when this return would be called function will actually return
            // and will execute the line current.remove(current.size() - 1);
            // which will help to remove the last added element to the current list
            // and for loop will be retried with the next value of i
            return;
        }

        // otherwise we need to consider all numbers from [0, targetSum] in order to find a possible permutation
        // we will use the current i as a number and add it to our list
        // call the function with size reduced by 1, as we have used one of the numbers
        // and we will reduce the targetSum with this value
        // if we have tried
        for (int i = 0; i <= targetSum; i++) {
            // add current number to the current list
            current.add(i);
            // call the function
            calc(size - 1, targetSum - i, current, result);
            // once all possible solutions are tried -
            // we come back - we would like to remove the last number and do backtrack
            current.remove(current.size() - 1);
        }
    }

}
