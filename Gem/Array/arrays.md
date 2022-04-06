# Arrays
## prefix sum  
```java 
public class Solution {
    public int[] prefixes(int[] A) {
        int n = A.length;
        int[] B = new int[n];;
        for (int i = 0; i < n; i++) {
            B[i] = A[i]; 
            if(i > 0) B[i] += B[i-1];
        }
        return B;
    }
}
```

## [range sum query immutable](https://leetcode.com/problems/range-sum-query-immutable/)  
- prefix sum nums, subtract range(prefix) from end to start - 1; 


## [maximum subarray](https://leetcode.com/problems/maximum-subarray/) 
- max, maxSoFar, max(max + arr[i], arr[i]) 

## [merge two sorted arrays](https://leetcode.com/problems/merge-sorted-array/) 
- arrays sorted, tow pointers p1, p2, maximum in puts in last pos.   
- if p1 = 0, nums1[p] = nums2[p2]

## [product of array except self](https://leetcode.com/problems/product-of-array-except-self/) 
- left, product of all left, right, product of all left and right. 
- res[i] = left[i] * right[i] 

## [maximum average subarray](https://leetcode.com/problems/maximum-average-subarray-i/) 
- sliding window, sum first k elements, sub k-i, max between sum and res. 

## [missing number](https://leetcode.com/problems/missing-number/) 
- sum of all elements in range (n * (n+1) / 2) - sum the actual elements in the array. 

## [max consecutive ones](https://leetcode.com/problems/max-consecutive-ones/) 
- sliding windows, max(currentCount, max)

## [find numbers with even number of digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
- count number of digits for every num, if even, even+=1.

## [squares of a sorted array](https://leetcode.com/problems/squares-of-a-sorted-array/)
- O(NLogn) squaring, then sorting. 
- O(N) two pointers Abs of left and right.

## [duplicate zeros](https://leetcode.com/problems/duplicate-zeros/)
- count number of zeros, start backward, len + 0's - 1, if zero, wire it minus write another 0, if not, add num. to end.

## [remove element](https://leetcode.com/problems/remove-element/)
- **1** two pointers, if not equal, keep in l, if equal, move forward(l++).  
- **2** two pointers, if equal, move to last one, and delete(r--).

## [remove duplicates from sorted array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) 
- fast and slow pointer, if not equal, l++, nums[l] = nums[r]. 

## [intersection of two arrays](https://leetcode.com/problems/intersection-of-two-arrays/) 
- two sets, one for each array, if in both, add to result.

## [next permutation](https://leetcode.com/problems/next-permutation/) 
- find first decreasing number, swap with next num bigger in right, reverse the rest.  

## [3sum](https://leetcode.com/problems/3sum/)
- 