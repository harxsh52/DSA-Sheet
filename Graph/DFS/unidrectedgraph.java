package Graph.DFS;

import java.util.ArrayList;
import java.util.List;

public class unidrectedgraph {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge:edges){
            int v=edge[0];
            int u=edge[1];
            adj.get(v).add(u);
            adj.get(u).add(v);
        }
        boolean[] v=new boolean[V];
        for(int i=0;i<V;i++){
            if(!v[i]){
                if(DFS(i,-1,v,adj)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean DFS(int start,int parent,boolean[] visited,List<List<Integer>> adj){
        visited[start]=true;
        for (int v : adj.get(start)) {
            
            if (!visited[v]) {
                if (DFS(v, start, visited, adj)) {
                    return true;
                }
            } 
            else if (v != parent) {
                return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        unidrectedgraph graph = new unidrectedgraph();
        int V = 5;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        boolean hasCycle = graph.isCycle(V, edges);
        System.out.println("Does the graph have a cycle? " + hasCycle);
    }
}
