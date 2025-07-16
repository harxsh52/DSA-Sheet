package Graph.DFS;

public class islands {
    public int numIslands(char[][] grid) {
        int islands = 0;
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
          if(grid[i][j] == '1'){
            islands++;
            dfs(grid, i,j);
          } 
        }
      }
      return islands;
    }
    void dfs(char[][] grid, int i, int j){
      if(i>=0 && i<grid.length && j>=0 && j<grid[i].length && grid[i][j]=='1'){
      //System.out.println(i+ " \t"+j);
        grid[i][j] = '0';
        dfs(grid, i+1,j);
        dfs(grid, i-1,j);
        dfs(grid, i,j+1);
        dfs(grid, i,j-1);
        }
      
    }
}
