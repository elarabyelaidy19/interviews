package Gem.Trie;

import java.util.HashMap;
import java.util.Map;

class WordDictionary { 
    
    private class Node { 
        private boolean isWord;
        private Map<Character, Node> next; 
        
        public Node(boolean isWord) { 
            this.isWord = isWord; 
            next = new HashMap<>();
        } 
        
        public Node() { 
            this(false);
        } 
        
    }
    
    private Node root; 
    

    public WordDictionary() {
        this.root = new Node();    
    }
    
    public void addWord(String word) {
        Node curr = root; 
        for(char c : word.toCharArray()) { 
            if(!curr.next.containsKey(c)) 
                curr.next.put(c, new Node()); 
            
            curr = curr.next.get(c);
        }
        curr.isWord = true;
    }
    
    private boolean match(Node node, String word, int index) { 
        if (index == word.length()) {
            return node.isWord;
        }
        Character currC = word.charAt(index);
        if (currC == '.') {
            for (Character c : node.next.keySet()) {
                if(match(node.next.get(c), word, index + 1)){
                    return true;
                }
            }
            return false;
        } else {// currC!='.'
            if (node.next.get(currC) == null) {
                return false;
            }
            return match(node.next.get(currC), word, index + 1);
        }
    }
    
    public boolean search(String word) {
        return match(root, word, 0);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */