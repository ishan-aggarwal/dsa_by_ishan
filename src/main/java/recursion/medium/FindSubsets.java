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
        int startIndex = 0;
        calculate(str, "", startIndex, str.length(), ans);
        System.out.println("Total subsets are: " + ans.size() + " for string of length : " + str.length());
        return ans;
    }

    private static void calculate(String input, String output, int index, int len, List<String> ans) {

        // base condition
        if (index >= len) {
            ans.add(output);
            return;
        }

        char currentChar = input.charAt(index);
        // choice-1 - do not include current character is not included in the output
        calculate(input, output, index + 1, len, ans);
        // choice-2 include the current character in the output
        calculate(input, output + currentChar, index + 1, len, ans);
    }

    private static void printSubsets(String input, String output) {
        // base condition
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        // find the starting character from input string on which decision is required
        char c = input.charAt(0);
        // update the input string by removing the 0th character from input string as decision choices will be made on char at 0th pos
        String substring = input.substring(1);
        // do no include start char in output
        printSubsets(substring, output);
        // include the start char in the output
        printSubsets(substring, output + c);

    }
}