package Gem.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Matrices {
    class NumMatrix {

        private int[][] sum;

        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0) {
                sum = null;
                return;
            }

            sum = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    sum[i][j] = matrix[i][j];

                    if (i > 0) {
                        sum[i][j] += sum[i - 1][j];
                    }
                    if (j > 0) {
                        sum[i][j] += sum[i][j - 1];
                    }
                    if (i > 0 && j > 0) {
                        sum[i][j] -= sum[i - 1][j - 1];
                    }
                }

            }
        }

        private int getSum(int row, int col) {
            if (sum == null)
                return 0;
            if (row < 0 || col < 0)
                return 0;
            return sum[row][col];
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int total = getSum(row2, col2);
            int extra = getSum(row2, col1 - 1) - getSum(row1 - 1, col1 - 1) + getSum(row1 - 1, col2);
            return total - extra;
        }
    }


    public String[] findWords(String[] words) { 
        String[] rows = { "qwertyuiop", "asdfghjkl", "zxcvbnm" }; 
        Map<Character, Integer> map = new HashMap<>(); 
        for(int i = 0; i < rows.length; i++) { 
            for(char c : rows[i].toCharArray()) 
                map.put(c, i);
        } 

        List<String> res = new LinkedList<>();
        
        for(String w : words) { 
            if(w.equals("")) continue;
            int index = map.get(w.toLowerCase().charAt(0)); 
            for(char c : w.toLowerCase().toCharArray()) { 
                if (map.get(c) != index); { 
                    index = -1; 
                    break;
                } 
                    
            }
            if(index != -1) res.add(w);
        }
        return res.toArray(new String[0]);
    }


    public boolean isToelpitzMatrix(int[][] matrix) { 
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[0].length; j++) { 
                if(i+1 < matrix.length && j+1 < matrix[0].length && matrix[i][j] != matrix[i+1][j+1]) 
                    return false;
            }
        }
        return true;
    } 


    public List<Integer> spiralMatrix(int[][] matrix) { 
        List<Integer> res = new ArrayList<>();
        int top = 0; 
        int bottom = matrix.length-1; 
        int left = 0; 
        int right = matrix[0].length-1; 

        while(true) { 
            
            for(int i = left; i <= right; i++) res.add(matrix[top][i]); 
            top++; 
            if(top > bottom || left > right) break; 
            
            for(int i = top; i <= bottom; i++) res.add(matrix[i][right]); 
            right--; 
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]); 
            bottom--;
            if(left > right || top > bottom) break; 

            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }
        return res;
    }


    public void rotate(int[][] matrix) { 
        int len = matrix.length; 
        

        // transpose 
        for(int i = 0; i < len; i++) { 
            for(int j = i; j < len; j++) { 
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i]; 
                matrix[j][i] = temp;
            }
        }

        // reverse
        for(int i = 0; i < len; i++) { 
            for(int j = 0; j < len/2; j++) { 
                int temp = matrix[i][len-j-1]; 
                matrix[i][len-j-1] = matrix[i][j]; 
                matrix[i][j] = temp;
            }
        }
    }

    class Solution {
        public void setZeroes(int[][] matrix) {
            int R = matrix.length;
            int C = matrix[0].length;

            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (matrix[i][j] == 0) {
                        row.add(i);
                        col.add(j);
                    }
                }
            }

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (row.contains(i) || col.contains(j))
                        matrix[i][j] = 0;
                }
            }

        }
    }

    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                char val = board[row][col];
                if (val != '.') {
                    int block = (row / 3 * 3) + (col / 3);
                    if (set.contains("r" + row + val) ||
                            set.contains("c" + col + val) ||
                            set.contains("b" + block + val))
                        return false;
                    else {
                        set.add("r" + row + val);
                        set.add("c" + col + val);
                        set.add("b" + block + val);
                    }
                }
            }
        }

        return true;
    }

}
