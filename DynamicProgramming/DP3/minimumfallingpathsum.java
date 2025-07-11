package DynamicProgramming.DP3;

public class minimumfallingpathsum {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int upl=matrix[i][j];
                if(j==0){
                    upl+=Math.min(dp[i-1][j],dp[i-1][j+1]);
                }else if(j==n-1){
                    upl+=Math.min(dp[i-1][j-1],dp[i-1][j]);
                }else{
                    int t=Math.min(dp[i-1][j-1],dp[i-1][j+1]);
                    upl+=Math.min(t,dp[i-1][j]);
                }
                dp[i][j]=upl;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(dp[m-1][i],ans);
        }
        return ans;
    }
}
