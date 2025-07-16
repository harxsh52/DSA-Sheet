package Graph.DFS;

import java.util.ArrayList;

public class connected {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int v=edge[0],u=edge[1];
            adj.get(v).add(u);
            adj.get(u).add(v);
        }
        boolean[] v=new boolean[V];
        for(int i=0;i<V;i++){
            if(!v[i]){
            ArrayList<Integer> com=new ArrayList<>();
            DFS(v,adj,i,com);
            result.add(com);
            }
            
        }
        return result;
    }
    public void DFS(boolean[] v,ArrayList<ArrayList<Integer>> adj,int start,ArrayList<Integer> result){
        v[start]=true;
        result.add(start);
        for(int i:adj.get(start)){
            if(!v[i]){
                DFS(v,adj,i,result);
            }
        }
    }
}
