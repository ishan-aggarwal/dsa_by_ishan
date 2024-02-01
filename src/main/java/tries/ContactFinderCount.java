package tries;

import java.util.ArrayList;
import java.util.List;

public class ContactFinderCount {

    static class TrieNode {
        int count;
        TrieNode[] children;

        TrieNode(int count) {
            this.count = count;
            this.children = new TrieNode[26];
        }
    }

    TrieNode root = new TrieNode(1);

    public List<Integer> solve(int[] A, String[] B) {
        List<Integer> ansPrefixCount = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                insert(root, B[i]);
            else {
                ansPrefixCount.add(searchWordsWithPrefix(root, B[i]));
            }
        }
        return ansPrefixCount;
    }

    public void insert(TrieNode root, String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (currentNode.children[index] == null) {
                currentNode.children[index] = new TrieNode(1);
            } else {
                currentNode.children[index].count++;
            }
            currentNode = currentNode.children[index];
        }
    }

    public int searchWordsWithPrefix(TrieNode root, String prefix) {
        TrieNode curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (curr.children[index] == null)
                return 0;
            curr = curr.children[index];
        }
        return curr.count;
    }

    public static void main(String[] args) {
        ContactFinderCount solution = new ContactFinderCount();
        int[] A = {0, 0, 1, 1};
        String[] B = {"hack", "hacker", "hac", "hak"};
        System.out.println(solution.solve(A, B));
    }
}

