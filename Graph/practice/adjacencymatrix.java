package Graph.practice;

public class adjacencymatrix {
    public static void main(String[] args) {
        int n=5;
        int[][] matrix=new int[n][n];
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 3}, {3, 4}
        };
        for(int[] edge:edges){
            int v=edge[0],u=edge[1];
            matrix[u][v]=1;
            matrix[v][u]=1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
