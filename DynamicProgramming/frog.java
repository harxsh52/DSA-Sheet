package DynamicProgramming;

import java.util.Arrays;

public class frog {
    public int frogJump(int[] heights) {
        int n=heights.length;
        int dp[]=new int[n];
  Arrays.fill(dp,-1);

        dp[0]=0;
  for(int ind=1;ind<n;ind++){
      int jumpTwo = Integer.MAX_VALUE;
        int jumpOne= dp[ind-1] + Math.abs(heights[ind]-heights[ind-1]);
        if(ind>1)
            jumpTwo = dp[ind-2] + Math.abs(heights[ind]-heights[ind-2]);
    
        dp[ind]=Math.min(jumpOne, jumpTwo);

    }
    return dp[n-1];
}}
