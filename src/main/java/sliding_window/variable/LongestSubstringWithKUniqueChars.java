package sliding_window.variable;

import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/

public class LongestSubstringWithKUniqueChars {

    private static String largestSubString(String str, int k) {

        int i = 0, j = 0;
        int start = -1, end = -1;
        Map<Character, Integer> charFreqMap = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        while (j < str.length()) {
            char rChar = str.charAt(j);
            charFreqMap.put(rChar, charFreqMap.getOrDefault(rChar, 0) + 1);

            int size = charFreqMap.size();
            if (size == k) {
                if (maxLen < j - i + 1) {
                    maxLen = j - i + 1;
                    start = i;
                    end = j;
                }
            } else if (size > k) {
                while (i < j && charFreqMap.size() > k) {
                    char lChar = str.charAt(i);
                    charFreqMap.put(lChar, charFreqMap.get(lChar) - 1);
                    if (charFreqMap.get(lChar) == 0) {
                        charFreqMap.remove(lChar);
                    }
                    i++;
                }
            }
            j++;
        }
        return start == -1 ? "" : str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String str = "aabacbebebe";
        System.out.println(largestSubString(str, 3));
    }
}
