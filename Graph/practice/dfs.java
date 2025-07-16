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
        // 
        int n=5;
        int[][] edges={{0,1},{1,2},{2,3},{3,4}};
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int v=edge[0];
            int u=edge[1];
            adj.get(v).add(u);
            adj.get(u).add(v);
        }
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            DFS(adj,i,visited);
            Arrays.fill(visited, false); // Reset visited for next component
            System.out.println();
        }

    }
    public static void DFS(List<List<Integer>> adj,int start,boolean[] visited){
        visited[start]=true;
        System.out.print(start + " ");
        for(int neighbor:adj.get(start)){
            if(!visited[neighbor]){
                DFS(adj, neighbor, visited);
            }
        }
    }
}
