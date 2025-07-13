package DynamicProgramming.DP4;

public class targetsum {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(target>sum || (target+sum)%2==1 || target+sum<0){
            return 0;
        }
        sum=(sum+target)/2;
        return count(nums,sum);
    }
    public int count(int[] nums,int sum){
        int[] dp=new int[sum+1];
        dp[0]=1;
        for(int num:nums){
            for(int j=sum;j>=num;j--){
                dp[j]=dp[j]+dp[j-num];
            }
        }
        return dp[sum];
    }
}
