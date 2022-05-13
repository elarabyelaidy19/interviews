## [valid plindrome2](https://leetcode.com/problems/valid-palindrome-ii/) 
- check if a string is a palindrome
- when there is not match, move left or right one character and check if it is a palindrome.

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

## [three sum closest](https://leetcode.com/problems/3sum-closest/)
- sort array, two pointers, find minimum difference. 

## [three sum smaller](https://leetcode.com/problems/3sum-smaller/) 
- **O(n^2)** time and **O(n)** space.
- sort array, two pointers, find how many numbers are smaller than the target. 
-  A[i] + A[j] + A[k] < target, which means the numbers between j and k are all less than target, because the array is sorted. Then we move the j pointer forward. 
- If A[i] + A[j] + A[k] >= target, we move k pointer backward. 

## [subarray product less than k](https://leetcode.com/problems/subarray-product-less-than-k/) 
- two pointers, one for aqcuiring the product, one for reduces if the product is greater than k. 
- when the product is greater than k, resduce product by divide num on left.
- when the product is less than k, increase count by (r-l+1). 
- every step introduce x new subarray (5, 2) => (5, (2, (6))) here we introduced three subarrays (6), (2,6), (5,2,6) 

## [sort colors](https://leetcode.com/problems/sort-colors/)
- two end pointers, 0s goes to left, twos goes to right. after ones will be in middle.
