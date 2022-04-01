# Sorting

## [valid anagram](https://leetcode.com/problems/valid-anagram/) 
- **ONE** array of chars and sorting **O(n log n)**
- **TWO** Fre Array == 0 **O(n)**

## [contains duplicate](https://leetcode.com/problems/contains-duplicate/)
- **ONE** sort array **O(n log n, O(1))** 
- **TWO** HashSet **O(N), O(N)**  

## [maximum product](https://leetcode.com/problems/maximum-product/)
- sort array multiply last three, first two min might be negative 

## [kth largest element](https://leetcode.com/problems/kth-largest-element-in-an-array/)
- sort n - k 

## [merge intervals](https://leetcode.com/problems/merge-intervals/)
- sort by start, merge if overlap, max(lsat[1], current[1])

## [largest number](https://leetcode.com/problems/largest-number/)
- sort, compare tow number, a+b <=> b+a

## [maximum length of pair chain](https://leetcode.com/problems/maximum-length-of-pair-chain/) 
- sort array on p[1] 
- next pair[0] > prev pair[1]