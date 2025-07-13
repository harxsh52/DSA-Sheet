package Graph.practice;

import java.util.ArrayList;
import java.util.List;

public class practice {

    public static  int findNumberOfComponent(int V, List<List<Integer>> edges) {
      boolean[] v = new boolean[V];
      int total = 0;
      for (int i = 0; i < V; i++) {
        if (!v[i]) {
          total++;
          DFS(edges, i, v);
        }
      }
      return total;
    }
    
    public static  void DFS(List<List<Integer>> edges, int i, boolean[] v) {
      v[i] = true;
      for (int f : edges.get(i)) {
        if (!v[f]) {
          DFS(edges, f, v);
        }
      }
    }

public static void main(String[] args) {
     int n = 7; // number of nodes
        int[][] edges = {
            {0, 1}, {0, 2}, {3, 4}, {5, 5} // self-loop on node 5
        };
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            int v=edge[0],u=edge[1];
            adj.get(v).add(u);
            adj.get(u).add(v);
        }
        boolean[] visited=new boolean[n];
        int component=0;
        int t=findNumberOfComponent(n, adj);
        System.out.println("Total components: " + t);
    }
}
