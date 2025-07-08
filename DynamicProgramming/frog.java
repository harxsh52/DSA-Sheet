package DynamicProgramming;

import java.util.Arrays;

public class frog {
    //meomrisation
    int[] dp;
    int minCost(int[] height) {
        // code here
        dp=new int[height.length];
        Arrays.fill(dp,-1);
        int t=recursion(height.length-1,height);
        
        
        return t;
    }
    public int recursion(int i,int[] height){
        if(i==0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int second=Integer.MAX_VALUE;
        int one=recursion(i-1,height)+Math.abs(height[i]-height[i-1]);
        if(i>1){
            second =recursion(i-2,height)+Math.abs(height[i]-height[i-2]);
        }
        dp[i]=Math.min(one ,second);
        return dp[i];
    }
//Tabulation
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
    //space optimization
    
}}
