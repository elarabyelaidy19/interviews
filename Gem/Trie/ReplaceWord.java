class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] tokens = sentence.split(" "); 
        TrieNode root = buildTrie(dictionary); 
        return replaceWords(tokens, root);
    }   
    
    private String replaceWords(String[] tokens, TrieNode root) { 
        StringBuilder strBuilder = new StringBuilder(); 
        for(String token : tokens) { 
            strBuilder.append(getShortestReplacement(token, root)); 
            strBuilder.append(" "); 
        }
        
        return strBuilder.substring(0, strBuilder.length()-1);
        
    }
    
    
    private String getShortestReplacement(String token, final TrieNode root) { 
        TrieNode curr = root; 
        StringBuilder strBuilder = new StringBuilder(); 
        
        for(char c : token.toCharArray()) { 
            strBuilder.append(c);
            if(curr.children[c - 'a'] != null) { 
                if(curr.children[c - 'a'].isWord) 
                    return strBuilder.toString(); 
                curr = curr.children[c - 'a'];
            } else { 
                return token;
            } 
        }
        return token;
    }
    
    private TrieNode buildTrie(List<String> dict) { 
        TrieNode root = new TrieNode(' '); 
        for(String word : dict) { 
            TrieNode curr = root; 
                for(char c : word.toCharArray()) { 
                    if(curr.children[c - 'a'] == null) 
                        curr.children[c - 'a'] = new TrieNode(c);
                    curr = curr.children[c - 'a'];
                } 
            curr.isWord = true;
        }
        return root;
    }
    
    public class TrieNode { 
        char val; 
        TrieNode[] children; 
        boolean isWord; 
        
        public TrieNode(char val) {
            this.val = val; 
            this.children = new TrieNode[26]; 
            this.isWord = false;
        }
    }
}