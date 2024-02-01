package tries;

public class TrieNodeArray {

    TrieNodeArray[] links = new TrieNodeArray[26];
    boolean flag = false;


    public TrieNodeArray get(char ch) {
        return this.links[ch - 'a'];
    }

    public void put(char ch, TrieNodeArray trieNode) {
        this.links[ch - 'a'] = trieNode;
    }

    public void setFlag(boolean value) {
        this.flag = value;
    }

    public boolean getFlag() {
        return this.flag;
    }
}
