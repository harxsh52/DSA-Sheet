package Graph.practice;

public class number_of_provinces {
    public int findCircleNum(int[][] isConnected) {
        boolean[] v=new boolean[isConnected.length];
        int total=0;
        for(int i=0;i<isConnected.length;i++){
            if(!v[i]){
                dfs(isConnected,i,v);
                total++;
            }
        }
        return total;
    }
    public void dfs(int[][] connected,int i,boolean[] v){
        v[i] = true;
        int V = connected.length;

        for (int j = 0; j < V; j++) {
            if (connected[i][j] == 1 && !v[j]) {
                dfs(connected, j, v);
            }
        }
    }
}
