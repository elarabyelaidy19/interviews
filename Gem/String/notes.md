
## [reverse word in string](https://leetcode.com/problems/reverse-words-in-a-string/) 
- split, move backward, stringbuilder. 

## [license key formatting](https://leetcode.com/problems/license-key-formatting/) 
- move backwoard, stringbuilder append chars, when sb length mod k append '-' reverse.

## [string to integer atoi](https://leetcode.com/problems/string-to-integer-atoi/) 
- handling overflow, handle sign, handle nondigits, handle leading spaces, handle leading +, handle leading 0.

## [reverse words in a string iii](https://leetcode.com/problems/reverse-words-in-a-string-iii/)
- split, reverse, join.

## [compare version numbers](https://leetcode.com/problems/compare-version-numbers/)
- split escape dot, compare each parsed.

## [longest absolute file path](https://leetcode.com/problems/longest-absolute-file-path/) 
- Split the string by '\n'
- Find the last index of '\t' { last because a sub-string may contain multiple '\t' but as above question they effectively a single sub-dir or file}
- Compute the remaining length of string without '\t'
- Check does this is a file or not
    - a) if a sub-dir, than append its length to just higher level sub-dir
    - b) if its a file, compute the length of string for this file. To compute, get the level at this file is and add the length of the file


(integer to english still in interview.school)