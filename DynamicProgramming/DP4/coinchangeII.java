package DynamicProgramming.DP4;

public class coinchangeII {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
       for(int i=0;i<n;i++)
       dp[i][0]=1;
       for(int j=1;j<=amount;j++)
       {
        if(j%coins[0]==0)
        dp[0][j]=1;
       }
       for(int index=1;index<n;index++)
       {
        for(int target=1;target<=amount;target++)
        {
            int dontPick=dp[index-1][target];
            int pick=0;
            if(coins[index]<=target)
            {
                pick=dp[index][target-coins[index]];
            }
            dp[index][target]=dontPick+pick;
        }
       }
      return dp[n-1][amount];
        
    }
}
