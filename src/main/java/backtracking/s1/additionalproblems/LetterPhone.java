package backtracking.s1.additionalproblems;

import java.util.*;

/*
Q1. Letter Phone

Problem Description
Given a digit string A, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.

NOTE: Make sure the returned strings are lexicographically sorted.

Problem Constraints
1 <= |A| <= 10

Input Format
The only argument is a digit string A.

Output Format
Return a string array denoting the possible letter combinations.

Example Input
Input 1:
 A = "23"
Input 2:
 A = "012"

Example Output
Output 1:
 ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
Output 2:
 ["01a", "01b", "01c"]
 */


public class LetterPhone {

    private static final Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "0");
        map.put(1, "1");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    public static void helper(
            ArrayList<String> result,
            String current,
            int index,
            String A
    ) {

        // base condition
        if (current.length() == A.length()) {
            result.add(current);
            return;
        }

        // actual logic
        char ch = A.charAt(index);
        int intValue = ch - '0';
        String letters = map.get(intValue);

        for (int i = 0; i < letters.length(); i++) {
            helper(result, current + letters.charAt(i), index + 1, A);
        }
    }

    public static ArrayList<String> letterCombinations(String A) {
        ArrayList<String> result = new ArrayList<>();
        helper(result, "", 0, A);
        return result;
    }

    public static void main(String[] args) {
        String A = "23";
        ArrayList<String> result = letterCombinations(A);
        System.out.println(result);
    }
}
