package DFS;

import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class DFS {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        visited[0] = true;
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            for (int adj : rooms.get(curr)) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    stack.push(adj);
                }
            }
        }
        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    } 



    //=========================================================================== 
    // find path 

    public boolean hasPath(List<List<Integer>> graphList, int src, int dist) { 
        if(src == dist) return true;
        for(int neigbor : graphList.get(src)) { 
           if (hasPath(graphList, neigbor, dist) == true) { 
                return true;
           }
        }
        return false; 
    }

    // ========================================================================== 
    // number of connected components 
    
    public int connectedComponnents(HashMap<Integer, List<Integer>> graph, int start) { 
        boolean[] visited = new boolean[graph.size()]; 
        int res = 0;
        for(int adj : graph.get(start)) { 
            if(!visited[adj]) { 
                dfs(graph, adj, visited); 
                res++; 
            }
        }
        return res;
    }

    public boolean dfs(HashMap<Integer, List<Integer>> graph, int start, boolean[] visted){ 
        if(visted[start]) return false;

        visted[start] = true;
        for(int adj : graph.get(start)) { 
            if(!visted[adj]) 
                dfs(graph, adj, visted);
        }
        return true;
    }


    // ==================================================================================
    // 
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1)
            return -1;
        HashMap<Integer, List<Integer>> graph = buildGraph(connections, n);

        int components = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            components += dfs3(graph, i, visited);
        }
        return components - 1;
    }

    public int dfs3(HashMap<Integer, List<Integer>> g, int s, boolean[] visited) {
        if (visited[s])
            return 0;
        visited[s] = true;
        for (int adj : g.get(s)) {
            dfs(g, adj, visited);
        }
        return 1;
    }

    public HashMap<Integer, List<Integer>> buildGraph(int[][] edges, int n) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++)
            graph.put(i, new ArrayList<>());

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    } 


    // ========================================================================================= 
    // Largest Components 

    // ==================================================================================
    
        List<List<Integer>> res = new LinkedList<>(); 
        if(heights == null || heights.length == 0 || heights[0].length == 0) 
            return res;
        int n = heights.length; 
        int m = heights[0].length; 
        boolean[][] pacific = new boolean[n][m]; 
        boolean[][] atlantic = new boolean[n][m]; 
        
        for(int i = 0; i < n; i++) { 
            dfs(heights, pacific, Integer.MIN_VALUE, i, 0); 
            dfs(heights, atlantic, Integer.MIN_VALUE, i, m-1); 
        }
        
        for(int i = 0; i < m; i++) { 
            dfs(heights, pacific, Integer.MIN_VALUE, 0, i); 
            dfs(heights, atlantic, Integer.MIN_VALUE, n-1, i); 
        }
        
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < m; j++) { 
                if(pacific[i][j] && atlantic[i][j]) 
                    res.add(new ArrayList<>(Arrays.asList(i,j)));
            }
        }
        return res;
    }
    
    
    int[][] dirs = new int[][] {{0,1},{0,-1},{1,0},{-1,0}}; 
    public void dfs(int[][] grid, boolean[][] visited, int h, int x, int y) { 
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] < h || visited[x][y]) 
            return; 
        visited[x][y] = true;
        for(int[] dir : dirs) { 
            int start = dir[0]; 
            int end = dir[1]; 
            dfs(grid, visited, grid[x][y], x + start, y + end);
        }
    }

}
