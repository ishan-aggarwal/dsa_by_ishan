package tries;

// https://leetcode.com/problems/longest-common-prefix/description/
// Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".

import java.util.HashMap;
import java.util.Map;

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
public class LongestCommonPrefix {

    static class TrieNode {
        Map<Character, TrieNode> map;
        int count;

        boolean isEnd;

        TrieNode() {
            this.map = new HashMap<>();
            this.count = 1;
            this.isEnd = false;
        }

        public Map<Character, TrieNode> getMap() {
            return map;
        }

        public int getCount() {
            return count;
        }

        public boolean isEnd() {
            return isEnd;
        }

        public void setEnd(boolean end) {
            isEnd = end;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    private static TrieNode root = new TrieNode();

    private static void setRoot() {
        root = new TrieNode();
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        createTrie(input);

        String answer = getLongestCommonPrefix();
        System.out.println("LongestCommonPrefix: " + answer);
        System.out.println("----------------------");

        setRoot();
        String[] input1 = {"dog", "racecar", "car"};
        createTrie(input1);

        answer = getLongestCommonPrefix();
        System.out.println("LongestCommonPrefix: " + answer);
    }

    private static String getLongestCommonPrefix() {
        TrieNode temp = root;
        StringBuilder answer = new StringBuilder();
        while (temp.getMap() != null && temp.getMap().size() == 1) {
            Character ch = null;
            for (Map.Entry<Character, TrieNode> entry : temp.getMap().entrySet()) {
                ch = entry.getKey();
                answer.append(ch);
            }
            temp = temp.getMap().get(ch);
        }
        return answer.toString();
    }

    private static void createTrie(String[] input) {
        for (String str : input) {
            TrieNode current = root;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i); // f
                if (current.getMap().containsKey(ch)) {
                    current.setCount(current.getCount() + 1); // increase the count by 1
                } else {
                    current.getMap().put(ch, new TrieNode());
                }
                current = current.getMap().get(ch);
            }
            current.setEnd(true);
        }
    }

}
