

## [valid plindrome2](https://leetcode.com/problems/valid-palindrome-ii/) 
- check if a string is a palindrome
- when there is not match, we remove left or right character and check if it is a palindrome.

## [valid mountain array](https://leetcode.com/problems/valid-mountain-array/) 
- two pointers, left and right, left is increasing and right is decreasing. 
- while increasing keep move l, while decreasing keep move r. 
- return l == r   

## [remove duplicates from sorted array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) 
- two pointers, one pointer for iterating the array and another for placing the next non-duplicate.

## [remove element](https://leetcode.com/problems/remove-element/)
- two pointers, one pointer for iterating the array and another for placing the next not ocurrence of k.

## [squares of sorted array](https://leetcode.com/problems/squares-of-a-sorted-array/) 
- two ponters, plcae the max at the end of the res. if square of negative number bigger than max?. 

## [three sum](https://leetcode.com/problems/3sum/)
- sort array, taking one number at a time and check if it is the negative sum of two numbers. 
- x + y + z = 0 => x + y = -z