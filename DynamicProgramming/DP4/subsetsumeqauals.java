package DynamicProgramming.DP4;

public class subsetsumeqauals {
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        boolean[][] dp=new boolean[arr.length][sum+1];
        for(int i=0;i<arr.length;i++){
            dp[i][0]=true;
        }
        
        if(arr[0]<=sum){
            dp[0][arr[0]]=true;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<=sum;j++){
                boolean notpick=dp[i-1][j];
                boolean pick=false;
                if(arr[i]<=j){
                    pick=dp[i-1][j-arr[i]];
                }
                dp[i][j]=pick || notpick;
            }
        }
        return dp[arr.length-1][sum];
    }
}
