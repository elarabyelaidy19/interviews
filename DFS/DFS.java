package DFS;

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
}
