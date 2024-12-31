package backtracking.s1;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {

    private static void generateSubsets(
            List<List<Integer>> result,
            List<Integer> currentAnswer,
            int idx,
            int[] array) {

        // base condition
        if (idx == array.length) {
            result.add(new ArrayList<>(currentAnswer));
            return;
        }

        // include element at current index
        int element = array[idx];
        currentAnswer.add(element);
        generateSubsets(result, currentAnswer, idx + 1, array);

        // don't include element at current index
        currentAnswer.remove(currentAnswer.size() - 1);
        generateSubsets(result, currentAnswer, idx + 1, array);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentAnswer = new ArrayList<>();
        int startIndex = 0;

        generateSubsets(result, currentAnswer, startIndex, arr);
        System.out.println(result);
    }
}
