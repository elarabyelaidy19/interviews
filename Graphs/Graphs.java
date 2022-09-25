
public class Graphs { 
   
    // ==================================================================================
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int r, int c) {
        if (r > 0 && c > 0 && r < grid.length-1 && c < grid[0].length-1 && grid[r][c] == 1) {
            grid[r][c] = 0;
            dfs(grid, r + 1, c);
            dfs(grid, r - 1, c);
            dfs(grid, r, c + 1);
            dfs(grid, r, c - 1);
        }
    }


    // ============================================================================== 
    // Flood Fill
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor)
            dfs(image, sr, sc, color, newColor);
        return image;
    }

    public void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r >= 1)
                dfs(image, r - 1, c, color, newColor);
            if (c >= 1)
                dfs(image, r, c - 1, color, newColor);
            if (r + 1 < image.length)
                dfs(image, r + 1, c, color, newColor);
            if (c + 1 < image[0].length)
                dfs(image, r, c + 1, color, newColor);
        }
    } 



    // ========================================================================== 
    // Max Area of Island
     public int maxAreaOfIsland(int[][] grid) {
        int max = 0; 
        
        for(int i = 0; i < grid.length; i++) { 
            for(int j = 0; j < grid[0].length; j++) { 
                if (grid[i][j] == 1) { 
                    max = Math.max(max, dfs(grid, i, j)); 
                }
            }
        }
        return max;
    }
    
    public int dfs(int[][] grid, int r, int c) { 
        if(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == 1) {
            grid[r][c] = 0;
            return 1 + dfs(grid, r+1, c) + dfs(grid, r-1, c) + dfs(grid, r, c+1)  + dfs(grid, r, c-1);
        }
        return 0;
    } 


    // ========================================================================================== 
    // number of enclaves 

    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (isValid(grid, i, j)) {
                    dfs2(grid, i, j);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1)
                    res++;
            }
        }
        return res;
    }

    public void dfs2(int[][] grid, int row, int col) {
        if (row >= 0 && col >= 0 && row <= grid.length - 1 && col <= grid[0].length - 1 && grid[row][col] == 1) {
            grid[row][col] = 0;
            dfs(grid, row + 1, col);
            dfs(grid, row - 1, col);
            dfs(grid, row, col + 1);
            dfs(grid, row, col - 1);
        }
    }

    public boolean isValid(int[][] A, int row, int col) {
        return (row == 0 || col == 0 || row == A.length - 1 || col == A[0].length - 1);
    }

}
