# Sets 
## two variations of sets
### HashSet 
- Hashtable based 
- constant time operations 

```java 
Set<Integer> set = new HashSet<>(); 
set.add(7); 
set.contains(7); 
set.remove(7); 
set.size(); 
```
### TreeSet 
- balanced binary search tree based
- logaritmic time operations
- keeps elements in sorted order

# Maps 
- <key, vlaue> pairs

## two variations of maps

### HashMap
- Hashtable based
- constant time operations


### TreeMap
- balanced binary search tree based 
- logaritmic time operations 
- keeps elements in sorted order by key


## [contains duplicates](https://leetcode.com/problems/contains-duplicate/)
- set 

## [two sum](https://leetcode.com/problems/two-sum/)
- hash map tracking each diff

## [intersection of two arrays](https://leetcode.com/problems/intersection-of-two-arrays/) 
- two sets, one for each array, if in both, add to result. 

## [group anagrams](https://leetcode.com/problems/group-anagrams/)
- sort each string, map each sorted string to bucket words of angaram.
 
## [word patterns](https://leetcode.com/problems/word-pattern/) 
- map each char to string, if char already mapped to string, check if it matches.

## [contains duplicates2](https://leetcode.com/problems/contains-duplicate-ii/)
- hash val-> index, if true return true, else update. 

## [subarray sum equals k](https://leetcode.com/problems/subarray-sum-equals-k/)
- map track commulative sum and num of occurence, if sum - k in map, count+= num of occur. 
- update map with new sum with occurence. 

## [happy number](https://leetcode.com/problems/happy-number/)
- sum of digits squared, if sum == 1, set to track cycles"if you encounter this num before". 

## [four sum2](https://leetcode.com/problems/4sum-ii/) 
- sum two arrays, map track num of occurences of each sum. 
- find minus sum of others, if in map, add to result.
- 0 = -(c+d) + (a+b) 