package tries;

import java.util.Arrays;

// Problem Description

// Given an array of words A (dictionary) and another array B (which contain some words).
//
//You have to return the binary array (of length |B|) as the answer where 1 denotes that the word is present in the dictionary and 0 denotes it is not present.
//
//Formally, for each word in B, you need to return 1 if it is present in Dictionary and 0 if not.
//
//Such problems can be seen in real life when we work on any online editor (like Google Documnet), if the word is not valid it is underlined by a red line.
//
//NOTE: Try to do this in O(n) time complexity.

// A = [ "hat", "cat", "rat" ]
// B = [ "cat", "ball" ]

public class SearchWordsInDictionary {
    static TrieNodeMap root = new TrieNodeMap();

    public static void insert(String word) {
        TrieNodeMap cur = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!cur.map.containsKey(ch)) {
                cur.map.put(ch, new TrieNodeMap());
            }
            cur = cur.map.get(ch);
        }
        cur.isEnd = true;
    }

    public static boolean search(String word) {
        TrieNodeMap cur = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!cur.map.containsKey(ch)) {
                return false;
            }
            cur = cur.map.get(ch);
        }
        return cur.isEnd;
    }

    public static int[] solve(String[] A, String[] B) {
        // prepare trie with the list of dictionary words
        for (String s : A) {
            insert(s);
        }

        // search for the words in the trie data structure
        // and fill the res array
        int[] res = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            boolean isFound = search(B[i]);
            if (isFound)
                res[i] = 1;
            else
                res[i] = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] A = {"hat", "cat", "rat"};
        String[] B = {"cat", "ball"};
        System.out.println(Arrays.toString(solve(A, B)));
    }
}
