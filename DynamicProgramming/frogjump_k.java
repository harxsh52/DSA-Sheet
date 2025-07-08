package DynamicProgramming;

public class frogjump_k{
    public int correctFrogJump(int[] heights, int k) {
    int n = heights.length;
    int[] dp = new int[n];
    dp[0] = 0;

    for (int i = 1; i < n; i++) {
        int minCost = Integer.MAX_VALUE;
        // Iterate through all possible previous stones (from 1 to k steps back)
        for (int j = 1; j <= k; j++) {
            if (i - j >= 0) {
                // Cost = (cost to reach previous stone) + (cost of this jump)
                int cost = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                minCost = Math.min(minCost, cost);
            }
        }
        dp[i] = minCost;
    }
    return dp[n - 1];
}

    public static void main(String[] args) {
        frogjump_k fjk = new frogjump_k();
        int[] heights = {10, 30, 40, 20, 50};
        int k = 2; // Example value for k
        int result = fjk.correctFrogJump(heights, k);
        System.out.println("Minimum cost to reach the last stone: " + result);
    }
}
