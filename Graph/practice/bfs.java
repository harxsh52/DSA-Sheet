package Graph.practice;
import java.util.*;
public class bfs {
    public static void BFS(List<List<Integer>> adj, int n, int start) {
        boolean[] visited=new boolean[n];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        visited[start]=true;
        while(!queue.isEmpty()){
            int node=queue.poll();
            System.out.println(node+" ");
            for(int neighbour:adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 3}, {3, 4}
        };
        List<List<Integer>> adj=new ArrayList<>();
        List<List<Integer>> uniadj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            uniadj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int v=edge[0];
            int u=edge[1];
            adj.get(v).add(u);
            adj.get(u).add(v);
            uniadj.get(v).add(u);
        }
        System.out.println("BFS Travesal undirected graph");
        BFS(adj, n, 4);
        System.out.println();
        System.out.println("BFS Travesal directed graph");
        BFS(uniadj, n, 4);
    }
}
