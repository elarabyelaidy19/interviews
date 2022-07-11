package Grids;

public class Grid2 {
    
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        if (n == 0)
            return res;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;
        while (bottom >= top && right >= bottom) {
            for (int i = left; i <= right; i++) {
                res[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res[i][right] = num++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                res[bottom][i] = num++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                res[i][left] = num++;
            }
            left++;
        }
        return res;
    } 

    // ==========================================================
    // reshape matrix
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if (r * c != rows * cols)
            return mat;
        int out_cols = 0;
        int out_rows = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[out_rows][out_cols] = mat[i][j];
                out_cols++;
                if (out_cols == c) {
                    out_cols = 0;
                    out_rows++;
                }
            }
        }
        return res;
    }
}   
