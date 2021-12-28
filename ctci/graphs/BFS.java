package ctci.graphs;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class BFS { 
    enum State { UNVISITED, VISITED, VISITING }; 

    boolean search(Graph g, Node start, Node end) { 
        if(start == end) return true; 

        LinkedList<Node> q = new LinkedList<Node>();  

        for(Node n : g.getNodes()) { 
            n.state = State.UNVISITED;
        }

        start.state = State.VISITING; 
        q.add(start); 
        Node u; 
        while(!q.isEmpty()) { 
            u = q.removeFirst(); 
            if(u != null) { 
                for(Node v : u.getAdjacent()) { 
                    if(v.state == State.UNVISITED) { 
                        if(v == end) { 
                            return true;
                        } else { 
                            v.state = State.VISITING; 
                            q.add(v);
                        }
                    }               
                }
                u.state = State.VISITED;
            }
        } 
        return false;
    }
}