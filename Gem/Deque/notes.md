
## [simplify path](https://leetcode.com/problems/simplify-path/) 
- split by '/', ignore empty and '.', poll() when "..", push() when not ".." 
- use deque to store the path string builder + "/" pollLast() while not empty.
 