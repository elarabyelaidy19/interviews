
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

## [game of life](https://leetcode.com/problems/game-of-life/) 
- count num of ones or dies in neighbors. 

# Grid2


## [spiral matrix II](https://leetcode.com/problems/spiral-matrix-ii/)
- same as spiral matrix1.
