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





# Matrices 

## [range sum query 2d](https://leetcode.com/problems/range-sum-query-2d-immutable/) 
- prefix sum matrix. result = matrix[r2][c2] - (matrix[r2][c1-1] - matrix[r1-1][c2] + matrix[r1-1][c1-1] 
- [Explaination](https://www.youtube.com/watch?v=rkLDDxOcJxU&ab_channel=AlgorithmsMadeEasy) 


## [keyboard row](https://leetcode.com/problems/keyboard-row/)
- map every letter of row to index {c => i} index is the row number 
- for every char in word if the map index of all chars of words does't match break word can not added

## [toeplitz matrix](https://leetcode.com/problems/toeplitz-matrix/) 
- matrix[i][j] != matrix[i+1][j+1] and index within range.


## [spiral matrix](https://leetcode.com/problems/spiral-matrix/) 
- index within range, divides into 4 parts, finish update index. 
- top -> right -> bottom -> left 

![spiral](https://assets.leetcode.com/uploads/2020/11/13/spiral1.jpg) 


## [rotate image](https://leetcode.com/problems/rotate-image/) 
- transpose matrix matrix[i][j] = matrix[j][i]
- reverse matrix matrix[i][j] = matrix[i][n-j-1] 


## [set matrix zeros](https://leetcode.com/problems/set-matrix-zeroes/)
- use set to track rows and cols to be set to 0. 

## [valid sudoku](https://leetcode.com/problems/valid-sudoku/) 
- 

# [game of life](https://leetcode.com/problems/game-of-life/) 
- count num of ones or dies in neighbors. 


