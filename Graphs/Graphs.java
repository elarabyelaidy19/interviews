
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
        if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == '1') {
            grid[r][c] = '0';
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
            return 1 
                    + dfs(grid, r+1, c) 
                    + dfs(grid, r-1, c) 
                    + dfs(grid, r, c+1) 
                    + dfs(grid, r, c-1);
        }
        return 0;
    }

}
