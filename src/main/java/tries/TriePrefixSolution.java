package tries;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/implement-trie-prefix-tree/description/
public class TriePrefixSolution {

    static class TrieNode {
        Map<Character, TrieNode> map;
        boolean isEnd;

        public TrieNode() {
            this.map = new HashMap<>();
            this.isEnd = false;
        }

        public Map<Character, TrieNode> getMap() {
            return map;
        }

        public boolean isEnd() {
            return isEnd;
        }

        public void setEnd(boolean end) {
            isEnd = end;
        }
    }

    static TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!current.map.containsKey(ch)) {
                current.map.put(ch, new TrieNode());
            }
            current = current.map.get(ch);
        }
        current.setEnd(true);
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!current.map.containsKey(ch)) {
                return false;
            }
            current = current.map.get(ch);
        }
        return current.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!current.map.containsKey(ch)) {
                return false;
            }
            current = current.map.get(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        TriePrefixSolution trie = new TriePrefixSolution();
        trie.insert("apple");
        boolean result = trie.search("apple");// return True
        System.out.println(result);
        result = trie.search("app");     // return False
        System.out.println(result);
        result = trie.startsWith("app"); // return True
        System.out.println(result);
        trie.insert("app");
        result = trie.search("app");     // return True
        System.out.println(result);
    }
}