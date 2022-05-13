class Solution {
    private class Trie {
        private class TrieNode {
            Map<Character, TrieNode> edges;
            boolean isWordEnd;

            TrieNode() {
                this.edges = new HashMap<>();
                isWordEnd = false;
            }
        }

        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode currentNode = root;
            for (char c : word.toCharArray()) {
                if (!currentNode.edges.containsKey(c))
                    currentNode.edges.put(c, new TrieNode());
                currentNode = currentNode.edges.get(c);
            }
            currentNode.isWordEnd = true;
        }

        public boolean canBeBuilt(String word) {
            TrieNode currentNode = root;
            for (char c : word.toCharArray()) {
                if (!currentNode.edges.containsKey(c))
                    return false;
                currentNode = currentNode.edges.get(c);
                if (!currentNode.isWordEnd)
                    return false;
            }
            return true;
        }
    }

    public String longestWord(String[] words) {
        if (words == null || words.length == 0)
            return null;
        
        Trie trie = new Trie();
        for (String word : words)
            trie.insert(word);
        
        String answer = null;
        for (String word : words)
            if (trie.canBeBuilt(word))
                if (answer == null || answer.length() < word.length() || (answer.length() == word.length() && word.compareTo(answer) < 0)) {
                    answer = word;
                }
        
        return answer;
    }
}