package tries;

public class TrieNodeSolution {

    private final TrieNodeArray root;

    public TrieNodeSolution() {
        this.root = new TrieNodeArray();
    }

    private void insert(String str) {
        TrieNodeArray current = root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            TrieNodeArray trieNode = current.get(ch);
            if (trieNode == null) {
                current.put(ch, new TrieNodeArray());
            }
            current = current.get(ch);
        }
        current.setFlag(true);
    }

    private boolean search(String str) {
        TrieNodeArray current = root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            TrieNodeArray trieNode = current.get(ch);
            if (trieNode == null) {
                return false;
            }
            current = trieNode;
        }
        return current.getFlag();
    }

    public static void main(String[] args) {
        TrieNodeSolution solution = new TrieNodeSolution();
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
