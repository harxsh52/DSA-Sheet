package DynamicProgramming.DP4;

public class perfectsum {
    public int perfectSum(int[] num, int k) {
    int n = num.length;
    int mod = (int)1e9+7;

    int[][] dp = new int[n][k + 1];

    // Handle base case
    if (num[0] == 0) {
        dp[0][0] = 2;  // take or not take
    } else {
        dp[0][0] = 1;  // not take
        if (num[0] <= k)
            dp[0][num[0]] = 1;  // take
    }

    for (int ind = 1; ind < n; ind++) {
        for (int target = 0; target <= k; target++) {
            int notTaken = dp[ind - 1][target];
            int taken = 0;
            if (num[ind] <= target)
                taken = dp[ind - 1][target - num[ind]];
            
            dp[ind][target] = (notTaken + taken) % mod;
        }
    }

    return dp[n - 1][k];
}

}
