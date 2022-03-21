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
- prefix sum nums, sub range from end to start - 1; 
