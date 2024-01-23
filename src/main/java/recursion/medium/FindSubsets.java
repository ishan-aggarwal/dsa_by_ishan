package recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class FindSubsets {


    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(subsets(str));
        System.out.println("-----------");
        printSubsets(str, "");
    }

    private static List<String> subsets(String str) {
        List<String> ans = new ArrayList<>();
        calculate(str, "", ans);
        System.out.println("Total subsets are: " + ans.size() + " for string of length : " + str.length());
        return ans;
    }

    private static void calculate(String input, String output, List<String> ans) {
        // base condition
        if (input == null || input.isEmpty()) {
            ans.add(output);
            return;
        }

        char currentChar = input.charAt(0);
        // choice-1 - do not include current character is not included in the output
        calculate(input.substring(1), output, ans);
        // choice-2 include the current character in the output
        calculate(input.substring(1), output + currentChar, ans);
    }

    private static void printSubsets(String input, String output) {
        // base condition
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        // find the starting character from input string on which decision is required
        char c = input.charAt(0);
        // update the input string by removing the 0th character from input string as decision choices are already made on char at 0th pos
        // do no include start char in output
        printSubsets(input.substring(1), output);
        // include the start char in the output
        printSubsets(input.substring(1), output + c);
    }

    public static List<String> allSubsetOfString(String input, String output) {
        List<String> answer = new ArrayList<>();
        if (input.isEmpty()) {
            answer.add(output);
            return answer;
        }
        char ch = input.charAt(0);
        List<String> left = allSubsetOfString(input.substring(1), output + ch);
        List<String> right = allSubsetOfString(input.substring(1), output);
        left.addAll(right);
        return left;
    }

}
