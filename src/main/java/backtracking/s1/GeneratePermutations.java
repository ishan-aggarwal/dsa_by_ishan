package backtracking.s1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratePermutations {

    private static void generatePermutations(
            List<String> result,
            String currentAnswer,
            Set<Character> visitedElements,
            String input) {

        // base condition
        if (currentAnswer.length() == input.length()) {
            result.add(currentAnswer);
            return;
        }

        // condition to include the elements to the currentanswer
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!visitedElements.contains(ch)) {
                // do operation
                visitedElements.add(ch);
                // recurse operation
                generatePermutations(result, currentAnswer + ch, visitedElements, input);
                // undo operation
                visitedElements.remove(ch);
            }
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        List<String> result = new ArrayList<>();
        String currentAnswer = "";
        Set<Character> visitedElements = new HashSet<>();
        generatePermutations(result, currentAnswer, visitedElements, input);
        System.out.println(result);
    }
}