package DynamicProgramming.DP4;

public class Partition_sum {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
        boolean[][] dp=new boolean[nums.length][sum+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=sum){
            dp[0][nums[0]]=true;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=sum;j++){
                boolean notpick=dp[i-1][j];
                boolean pick=false;
                if(nums[i]<=j){
                    pick=dp[i-1][j-nums[i]];
                }
                dp[i][j]=pick || notpick;
            }
        }
        return dp[n-1][sum];
    }
}
