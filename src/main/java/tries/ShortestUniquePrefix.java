package tries;

// Problem Description

// Given a list of N words, find the shortest unique prefix to represent each word in the list.
// NOTE: Assume that no word is the prefix of another. In other words, the representation is always possible

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShortestUniquePrefix {

    //In this question, we are simply maintaining count variable
    // and checking how many times that particular character is called.
    // End is not required here since prefixes are unique. (Means there cannot be Ber and Bert.)

    class TrieNode {
        Map<Character, TrieNode> map;
        int count;

        TrieNode() {
            map = new HashMap<>();
            count = 1;
        }
    }

    TrieNode root;

    public void insert(String str) {
        TrieNode cur = root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if the char is not present in the map
            // that means it needs to be inserted for the first time
            // and the count will be initialized to 1
            if (!cur.map.containsKey(ch)) {
                cur.map.put(ch, new TrieNode());
            } else {
                // if the char is already present in the TrieNode map
                // then we should increase the frequencyCount by 1
                cur.map.get(ch).count++;
            }
            cur = cur.map.get(ch);
        }
    }

    public String findPrefix(String str) {
        StringBuilder sb = new StringBuilder();
        TrieNode currentNode = root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch);
            currentNode = currentNode.map.get(ch);
            if (currentNode.count == 1) {
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public String[] prefix(String[] A) {
        root = new TrieNode();
        int length = A.length;
        for (String s : A) {
            insert(s);
        }
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = findPrefix(A[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        ShortestUniquePrefix sol = new ShortestUniquePrefix();
        String[] A = {"zebra", "dog", "duck", "dove"};
        System.out.println(Arrays.toString(sol.prefix(A)));
    }
}
