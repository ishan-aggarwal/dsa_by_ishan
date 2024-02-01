package tries;

public class TrieNode {

    TrieNode[] links = new TrieNode[26];
    boolean flag = false;


    public TrieNode get(char ch) {
        return this.links[ch - 'a'];
    }

    public void put(char ch, TrieNode trieNode) {
        this.links[ch - 'a'] = trieNode;
    }

    public void setFlag(boolean value) {
        this.flag = value;
    }

    public boolean getFlag() {
        return this.flag;
    }
}
