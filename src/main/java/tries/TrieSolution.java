package tries;

public class TrieSolution {

    private final TrieNode root;

    public TrieSolution() {
        this.root = new TrieNode();
    }

    private void insert(String str) {
        TrieNode current = root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            TrieNode trieNode = current.get(ch);
            if (trieNode == null) {
                current.put(ch, new TrieNode());
            }
            current = current.get(ch);
        }
        current.setFlag(true);
    }

    private boolean search(String str) {
        TrieNode current = root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            TrieNode trieNode = current.get(ch);
            if (trieNode == null) {
                return false;
            }
            current = trieNode;
        }
        return current.getFlag();
    }

    public static void main(String[] args) {
        TrieSolution solution = new TrieSolution();
        System.out.println("Inserting keys into the trie structure");
        solution.insert("abc");
        solution.insert("abcd");
        solution.insert("ishan");
        System.out.println("Inserted keys into the trie structure");
        System.out.println(solution.search("abc"));
        System.out.println(solution.search("abcf"));
        System.out.println(solution.search("ab"));
    }
}
