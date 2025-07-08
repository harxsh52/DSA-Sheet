package DynamicProgramming;

public class frogjump_k{
    public int frogJump(int[] heights, int k) {
        int n=heights.length;
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int minjumps=Integer.MAX_VALUE;
            for(int j=1;i<=k;i++){
                if(i-j>=0){
                    int jumps=dp[i-j]+Math.min(minjumps,Math.abs(heights[i]-heights[j]));
                    minjumps=Math.min(jumps,minjumps);
                }
            }
              dp[i]=minjumps;
        }
        return dp[n-1];
    }
}
