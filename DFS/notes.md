# DFS 
You start in a node and recursively visit all other unvisited nodes connected to it. 

## Algorithm
- Start at the start node add it to the top of the stack mark it visited.
- take the top node off the stack.
- for each node connected to that node, if it has not been visited, add it to the stack and mark it visited. 
- repeat until the stack is empty.

## Complexity 
Time: O(|V|+|E|)
Space: O(|V|) 

## Code 
```java 
public void dfs(List<List<Integer>> graph) { 
    Stack<Integer> stack = new Stacl<>(); 
    boolean[] visited = new boolean[graph.size()]; 
    stack.push(0);  
    visited[0] = true;
    while(!stack.isEmpty()) { 
        int curr = stack.pop(); 
        for(int adj : graph.get(curr)) { 
            if(!visited[adj]) { 
                stack.push(adj); 
                visited[adj] = true;
            }
        }
    }
}
```