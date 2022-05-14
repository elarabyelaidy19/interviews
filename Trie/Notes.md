## [implement a trie](./PrefixTree.java) 
[implement a trie](https://leetcode.com/problems/implement-trie-prefix-tree/) 



## [Longest Word in Dictionary](./TrieDictionary.java)   
[Longest Word in Dictionary](https://leetcode.com/problems/longest-word-in-dictionary/)
- When we have a dictionary, we can use a trie to find the longest word in the dictionary. 
- When We can Built a word by adding one letter at a time? 
    - every letter in the word is a word.  


## [Map Sum Pairs](./MapSumPairs.java) 
[Map Sum Pairs](https://leetcode.com/problems/map-sum-pairs/) 
- check if the word already exists int the Trie, if so, update it with the new value. if not insert it. 
- keep track of the word/prefix value in the Trie. 
- if it is a prefix, we can just update the value of the prefix.


## [Replace Words](ReplaceWord.java) 
[replaceWords](https://leetcode.com/problems/replace-words/) 

- 


## [Design Add and Search Words](./DesignAddSearchWords.java) 

[Design Add and Search Words](https://leetcode.com/problems/add-and-search-word-data-structure-design/)
- add word to the trie. 
- search word in the trie, if the word is match return true, if not return false. 
- the dot is macth any charcter. if the word is starting with a dot, continue search all nodes that end with the same charcter. 
- if the word is not starting with a dot, continue search all nodes that start with the same charcter pf the word and end with any char.