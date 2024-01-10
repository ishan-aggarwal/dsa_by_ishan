package sliding_window.variable;

// https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAllUniqueChars {
    private static String solve(String str) {
        int i = 0, j = 0;
        int start = -1, end = -1;
        int maxLen = Integer.MIN_VALUE;
        Map<Character, Integer> characterFreqMap = new HashMap<>();

        while (j < str.length()) {
            char rChar = str.charAt(j);
            characterFreqMap.put(rChar, characterFreqMap.getOrDefault(rChar, 0) + 1);

            int size = characterFreqMap.size();
            if (size == j - i + 1) {
                if (maxLen < j - i + 1) {
                    maxLen = j - i + 1;
                    start = i;
                    end = j;
                }
            } else if (size < j - i + 1) {
                while (characterFreqMap.size() < j - i + 1) {
                    char lChar = str.charAt(i);
                    characterFreqMap.put(lChar, characterFreqMap.get(lChar) - 1);
                    if (characterFreqMap.get(lChar) == 0) {
                        characterFreqMap.remove(lChar);
                    }
                    i++;
                }
            }
            j++;
        }
        return start == -1 ? "" : str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(solve(str));
    }
}
