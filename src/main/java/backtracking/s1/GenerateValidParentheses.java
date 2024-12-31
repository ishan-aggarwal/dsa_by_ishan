package backtracking.s1;

import java.util.ArrayList;
import java.util.List;

public class GenerateValidParentheses {

    private static void generateVP(
            List<String> result,
            String ans,
            int openCount,
            int closeCount,
            int size) {

        // base condition
        if (openCount == size && closeCount == size) {
            result.add(ans);
            return;
        }

        // open bracket condition
        if (openCount < size) {
            generateVP(result, ans + "(", openCount + 1, closeCount, size);
        }

        // close bracket condition
        if (closeCount < openCount) {
            generateVP(result, ans + ")", openCount, closeCount + 1, size);
        }

    }

    public static void main(String[] args) {
        int A = 2;
        List<String> result = new ArrayList<>();
        generateVP(result, "", 0, 0, A);
        System.out.println(result);

        A = 3;
        result = new ArrayList<>();
        generateVP(result, "", 0, 0, A);
        System.out.println(result);
    }
}
