package Gem.Trie;
import java.util.HashMap;
import java.util.Map;

class MapSum { 
    
    private class Trie { 
        private class TrieNode { 
            Map<Character, TrieNode> edges; 
            int value; 
            int prefixSum; 
            boolean isWord; 
            
            TrieNode() { 
                edges = new HashMap<>(); 
                value = 0; 
                prefixSum = 0; 
                isWord = false;
            }
        }
        
        private TrieNode root; 
        
        public Trie() { 
            root = new TrieNode();
        }
        
        public void insert(String key, int value) { 
            int currValue = getWordValue(key); 
            int diff = value - currValue; 
            
            TrieNode curr = root;
            for(char c : key.toCharArray()) { 
                if(!curr.edges.containsKey(c)) { 
                    curr.edges.put(c, new TrieNode());
                } 
                curr = curr.edges.get(c); 
                curr.prefixSum += diff;
            }
            curr.isWord = true; 
            curr.value = value;
        }
        
        
        public int getWordValue(String key) { 
            TrieNode curr = root; 
            for(char c : key.toCharArray()) {  
                if(!curr.edges.containsKey(c)) 
                    return 0; 
                curr = curr.edges.get(c);   
            }
            return curr.value; 
        }
        
        public int getPrefixSum(String key) { 
            TrieNode curr = root; 
            for(char c : key.toCharArray()) { 
                if(!curr.edges.containsKey(c))
                    return 0; 
                curr = curr.edges.get(c);
            } 
            return curr.prefixSum;
        }
        
    } 
    
    Trie trie;

    public MapSum() { 
        trie = new Trie();
    }
    
    
    public void insert(String key, int val) { 
        trie.insert(key, val);
        
    }
    
    public int sum(String prefix) {
        return trie.getPrefixSum(prefix);
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */