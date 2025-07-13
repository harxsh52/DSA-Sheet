package Graph.practice;
import java.util.*;

public class adjacencylist {
    public static void main(String[] args) {
       int r=6;
       int[][] edges={{1, 2}, {1, 3}, {2, 4}, {3, 4}, {4, 5}};
       List<List<Integer>> adj=new ArrayList<>();
       for(int i=0;i<r;i++){
        adj.add(new ArrayList<>());
       }
       for(int[] edge:edges){
        int v=edge[0],u=edge[1];
        adj.get(v).add(u);
        adj.get(u).add(v);
       }
       for(int i=0;i<r;i++){
        System.out.print(i+":");
        for(int t:adj.get(i)){
            System.out.print(t+" ");
        }
        System.out.println();
       }
    }
}
