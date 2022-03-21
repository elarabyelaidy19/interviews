# prefix sum  
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