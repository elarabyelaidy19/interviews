package Gem.Array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
}
