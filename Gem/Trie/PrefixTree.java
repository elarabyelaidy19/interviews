public class Trie { 
    private class TrieNode { 
        Map<Character, TrieNode> edges;     
        boolean isWord; 

        public TrieNode() { 
            this.edges = new HashMap<>(); 
            this.isWords = false;
        }


    } 

    private TrieNode root; 

    public Trie() { 
        this.root = new TrieNode();
    }

    public void insert(TrieNode root, String word) { 
        TrieNode currentNode = root; 
        for(char c : word.toCharArray()) {  
            if(!currentNode.edges.containsKey(c)) { 
                currentNode.edges.put(c, new TrieNode());
            }
            currentNode = currentNode.edges.get(c);
        }
        currentNode.isWord = true;
    } 

    public boolean search(TrieNode root, String word) { 
        TrieNode currentNode = root; 
        for(char c : word.toCharArray()) { 
            if(!currentNode.edges.containsKey(c)) { 
                return false;
            }
            currentNode = currentNode.edges.get(c);
        }
        return currentNode.isWord;
    } 

    public boolean startWith(TrieNode root, String word) { 
        TrieNode currentNode = root; 
        for(char c : word.toCharArray()) { 
            if(!currentNode.edges.containskey(c))  
                return false; 
            currentNode = currentNode.edges.get(c);
        }

        return true;
    } 
}