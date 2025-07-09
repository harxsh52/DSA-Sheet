package DynamicProgramming.DP1_Fibonnaci;

public class frogjump_k {
    public int frogJump(int[] heights, int k) {
        int n=heights.length;
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int minjumps=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int one=dp[i-j]+Math.abs(heights[i]-heights[i-j]);
                    minjumps=Math.min(one,minjumps);
                }
                dp[i]=minjumps;
                
         }
    }
    return dp[n-1];
}
}
