package Graph.practice;
import java.util.*;

public class dfs {
    public static void Dfs(List<List<Integer>> adj,int node,boolean[] visited){
        visited[node]=true;
        System.out.print(node + " ");
        for(int neighbor:adj.get(node)){
            if(!visited[neighbor]){
                Dfs(adj, neighbor, visited);    
            }
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {
            {0, 1}, {0, 2},{1,5}, {1, 3}, {3, 4}, {2, 5},{3,5}
        };
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());     
        }
        List<List<Integer>> uniadj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            uniadj.add(new ArrayList<>());     
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // remove for directed graph
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            uniadj.get(u).add(v);
        }
        boolean[] visited = new boolean[n];
        
        System.out.println("DFS Traversal starting from node 0 for undirected graph:");
        Dfs(adj, 0, visited);
        System.out.println();
        System.out.println("DFS Traversal starting from node 0 for directed graph:" );
        Arrays.fill(visited,false);
        Dfs(uniadj,0,visited);

    }
}
