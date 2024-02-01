package tries;

import java.util.HashMap;
import java.util.Map;

public class TrieNodeMap {
    Map<Character, TrieNodeMap> map;
    boolean isEnd;

    TrieNodeMap() {
        map = new HashMap<>();
        isEnd = false;
    }
}