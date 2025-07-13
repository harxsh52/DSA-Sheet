package Graph.practice;
import java.util.*;
public class connected {
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
        for(int i=0;i<n;i++){
            List<Integer> com=new ArrayList<>();
            if(!visited[i]){
                DFS(i,adj,visited,com);
                component++;
            System.out.print("Component " + component + ": ");
                for (int node : com) {
                    System.out.print(node + " ");
                }
                System.out.println();
            }
        }
        System.out.println("Total compoents"+" " +component);
    }
    public static void  DFS(int i,List<List<Integer>> adj,boolean[] visited,List<Integer> com){
        visited[i]=true;
        com.add(i);
        for(int ii:adj.get(i)){
            if(!visited[ii]){
                DFS(ii,adj,visited,com);
            }
        }
    }
}
