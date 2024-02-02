package tries;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/implement-trie-prefix-tree/description/
public class TriePrefixSolution2 {

    static class TrieNode {
        Map<Character, TrieNode> map;

        int cp;
        int cw;

        public TrieNode() {
            this.map = new HashMap<>();
            this.cp = 0;
            this.cw = 0;
        }

        public Map<Character, TrieNode> getMap() {
            return map;
        }

        public int getCp() {
            return cp;
        }

        public void setCp(int cp) {
            this.cp = cp;
        }

        public int getCw() {
            return cw;
        }

        public void setCw(int cw) {
            this.cw = cw;
        }
    }

    static TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!current.map.containsKey(ch)) {
                // if the key does not exist, then insert the key with a new TrieNode
                current.map.put(ch, new TrieNode());
            }
            // move current to the reference of the inserted trie node
            current = current.map.get(ch);
            // increase the count prefix by 1
            current.setCp(current.getCp() + 1);
        }
        // increase the word count at the last by 1 when the string has reached the end
        current.setCw(current.getCw() + 1);
    }

    public int countWords(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!current.map.containsKey(ch)) {
                return 0;
            }
            current = current.map.get(ch);
        }
        return current.getCw();
    }

    public int countWordsStartsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!current.map.containsKey(ch)) {
                return 0;
            }
            current = current.map.get(ch);
        }
        return current.getCp();
    }


    public void erase(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!current.map.containsKey(ch)) {
                return;
            }
            // move current to the reference of the inserted trie node
            current = current.map.get(ch);
            // decrease the count prefix by 1
            current.setCp(current.getCp() - 1);
        }
        // decrease the word count at the last by 1 when the string has reached the end
        current.setCw(current.getCw() - 1);
    }

    public static void main(String[] args) {
        TriePrefixSolution2 trie = new TriePrefixSolution2();
        trie.insert("apple");
        trie.insert("apple");
        int count = trie.countWords("apple");// return 2
        System.out.println(count);
        count = trie.countWords("app");// return 0
        System.out.println(count);
        trie.insert("app");
        count = trie.countWordsStartsWith("app");     // return 3
        System.out.println(count);
        count = trie.countWords("app");// return 1
        System.out.println(count);
        trie.erase("apple");
        count = trie.countWordsStartsWith("app");     // return 2
        System.out.println(count);
        count = trie.countWords("apple"); // return 1
        System.out.println(count);
    }
}