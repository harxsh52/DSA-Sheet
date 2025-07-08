package DynamicProgramming.Practice.Knapsack;

public class Knapscak {
    //recursion
    public static int knapsackt(int[] values,int[] weights,int w,int n){
        if(n==0 ||w==0){
            return 0;
        }
        if(weights[n-1]<=w){
            int ans1=values[n-1]+knapsackt(values,weights,w-weights[n-1],n-1);
            int ans2=knapsackt(values,weights,w,n-1);
            return Math.max(ans1,ans2);
        }else{
            return knapsackt(values,weights,w,n-1);
        }
    }
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int w = 50;
        int n = values.length;
        System.out.println("Maximum value in Knapsack = " + knapsackt(values, weights, w, n));
    }
    //memoization
    public static int knapsackMemo(int[] values, int[] weights, int w, int n, int[][] dp) {
        if (n == 0 || w == 0)
            return 0;
        if (dp[n][w] != -1)
            return dp[n][w];
        if (weights[n - 1] <= w) {
            int ans1 = values[n - 1] + knapsackMemo(values, weights, w - weights[n - 1], n - 1, dp);
            int ans2 = knapsackMemo(values, weights, w, n - 1, dp);
            dp[n][w] = Math.max(ans1, ans2);
        } else {
            dp[n][w] = knapsackMemo(values, weights, w, n - 1, dp);
        }
        return dp[n][w]; 
    }
    //tabular form
    public static int knapsackTabular(int[] values, int[] weights, int w, int n) {
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (weights[i - 1] <= j) {
                    int ans1 = values[i - 1] + dp[i - 1][j - weights[i - 1]];
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    dp[i][j] = dp[i - 1][j];        }
            }
        }
        return dp[n][w];
    }
}
