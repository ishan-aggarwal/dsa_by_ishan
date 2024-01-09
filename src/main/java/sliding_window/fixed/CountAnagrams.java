package sliding_window.fixed;

// https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
// https://www.geeksforgeeks.org/count-occurrences-of-anagrams/

import java.util.HashMap;
import java.util.Map;

public class CountAnagrams {

    private static int search(String pat, String txt) {
        int answer = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // prepare a frequency map to store the frequency of each of the character
        for (Character c : pat.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        // this is basically the count that helps us to understand when to say an anagram is met
        int count = frequencyMap.size();

        // pointers to the current window
        int i = 0, j = 0;

        // total length for the window
        int n = txt.length();

        // length for the pattern/window length
        int k = pat.length();

        // iterate over the entire text string
        while (j < n) {

            // perform calculations
            char current = txt.charAt(j);

            // if the current character in the window is contained in frequency map, then reduce the
            // count of frequency by 1
            // further check if the count of frequency has become zero then reduce the count by 1
            // means we want to see if the count is reset to zero - we will increase our answer by 1
            if (frequencyMap.containsKey(current)) {
                // reduce the frequency by 1
                frequencyMap.put(current, frequencyMap.get(current) - 1);

                // if the frequency has become zero for this char then reduce the count by 1
                if (frequencyMap.get(current) == 0) {
                    count--;
                }
            }

            // if the window is not yet reached, expand the window
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) { // if the window size is reached, then we need to slide the window

                // if the count variable has become zero
                // then increase the answer by 1
                if (count == 0) {
                    answer++;
                }

                // check the last character which needs to be removed now
                // as this will get removed from window so in the frequency map we need to increase its freq by 1
                char leftChar = txt.charAt(i);
                if (frequencyMap.containsKey(leftChar)) {
                    frequencyMap.put(leftChar, frequencyMap.get(leftChar) + 1);
                    // if the frequency has changed from 0 to 1, that means we should also increase the count variable by 1
                    if (frequencyMap.get(leftChar) == 1) {
                        count++;
                    }
                }

                // slide the window
                i++;
                j++;
            }
        }

        // finally return the answer
        return answer;
    }

    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        System.out.println(search(pat, txt));

        txt = "aabaabaa";
        pat = "aaba";
        System.out.println(search(pat, txt));
    }
}
