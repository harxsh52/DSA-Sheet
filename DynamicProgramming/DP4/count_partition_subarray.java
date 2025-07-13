package DynamicProgramming.DP4;

public class count_partition_subarray {
    public int countPartitions(int n, int d, int[] arr) {
    int mod = (int)1e9 + 7;
    int totalsum = 0;
    for (int i : arr) {
        totalsum += i;
    }

    if ((totalsum - d) < 0 || (totalsum - d) % 2 != 0) {
        return 0;
    }

    int target = (totalsum - d) / 2;
    return findWays(arr, target, mod);
}

public int findWays(int[] arr, int k, int mod) {
    int n = arr.length;
    int[][] dp = new int[n][k + 1];

    // base case
    if (arr[0] == 0) {
        dp[0][0] = 2; // take or not take 0
    } else {
        dp[0][0] = 1;
        if (arr[0] <= k) dp[0][arr[0]] = 1;
    }

    for (int i = 1; i < n; i++) {
        for (int j = 0; j <= k; j++) {
            int notTaken = dp[i - 1][j];
            int taken = 0;
            if (arr[i] <= j) {
                taken = dp[i - 1][j - arr[i]];
            }
            dp[i][j] = (notTaken + taken) % mod;
        }
    }

    return dp[n - 1][k];
}
}
