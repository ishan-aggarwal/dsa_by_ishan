package sliding_window.variable;

import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/

public class SmallestSubstringContainingAllCharsFromPattern {


    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String pattern = "ABC";
        System.out.println(minimumWindow(str, pattern));
    }

    private static String minimumWindow(String str, String pattern) {

        int i = 0, j = 0;
        int start = -1, end = -1;
        int minLen = Integer.MAX_VALUE;
        Map<Character, Integer> patternFreqMap = new HashMap<>();

        for (Character c : pattern.toCharArray()) {
            patternFreqMap.put(c, patternFreqMap.getOrDefault(c, 0) + 1);
        }
        int count = patternFreqMap.size();

        while (j < str.length()) {

            char rightChar = str.charAt(j);
            if (patternFreqMap.containsKey(rightChar)) {
                patternFreqMap.put(rightChar, patternFreqMap.get(rightChar) - 1);

                if (patternFreqMap.get(rightChar) == 0) {
                    count--;
                }
            }
            if (count > 0) {
                j++;
            } else if (count == 0) {

                while (count == 0) {
                    if (minLen > j - i + 1) {
                        minLen = j - i + 1;
                        start = i;
                        end = j;
                    }

                    char leftChar = str.charAt(i);
                    if (patternFreqMap.containsKey(leftChar)) {
                        patternFreqMap.put(leftChar, patternFreqMap.get(leftChar) + 1);

                        if (patternFreqMap.get(leftChar) == 1) {
                            count++;
                        }
                    }
                    i++;
                }
                j++;
            }
        }
        return (start == -1) ? "" : str.substring(start, end + 1);
    }
}
