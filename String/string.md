
## [reverse word in string](https://leetcode.com/problems/reverse-words-in-a-string/) 
- split, move backward, stringbuilder. 

## [license key formatting](https://leetcode.com/problems/license-key-formatting/) 
- move backwoard, stringbuilder append chars, when sb length mod k append '-' reverse.

## [string to integer atoi](https://leetcode.com/problems/string-to-integer-atoi/) 
- handling overflow, handle sign, handle nondigits, handle leading spaces, handle leading +, handle leading 0.

## [reverse words in a string iii](https://leetcode.com/problems/reverse-words-in-a-string-iii/)
- split, reverse, join.

## [compare version numbers](https://leetcode.com/problems/compare-version-numbers/)
- split escape dot, compare each parsed num.

## [longest absolute file path](https://leetcode.com/problems/longest-absolute-file-path/) 
- Split the string by '\n'
- Find the last index of '\t' { last because a sub-string may contain multiple '\t'}
- Compute the remaining length of string without '\t'
- Check does this is a file or not
    - a) if a sub-dir, than append its length to just higher level sub-dir
    - b) if its a file, compute the length of string for this file. To compute, get the level at this file is and add the length of the file

## [simplify path](https://leetcode.com/problems/simplify-path/) 
- split by '/', ignore "" and '.', poll() when "..", push() when not ".." 
- use deque to store the path string builder + "/" pollLast() while not empty.

## [goat latin](https://leetcode.com/problems/goat-latin/) 
- store vowels, split on space, if begins with vowel append word + "ma"+ index * a, else substring(1) + at(0) + "ma" + "a" * i. 
- count store spaces.