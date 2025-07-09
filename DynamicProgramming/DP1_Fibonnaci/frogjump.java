package DynamicProgramming.DP1_Fibonnaci;

public class frogjump {
    public int frogJump(int[] height) {
    int n = height.length;
    int prev1 = 0, prev2 = 0; // dp[i-1], dp[i-2]

    for (int i = 1; i < n; i++) {
        int jumpOne = prev1 + Math.abs(height[i] - height[i - 1]);
        int jumpTwo = Integer.MAX_VALUE;
        if (i > 1)
            jumpTwo = prev2 + Math.abs(height[i] - height[i - 2]);

        int curr = Math.min(jumpOne, jumpTwo);
        prev2 = prev1;
        prev1 = curr;
    }

    return prev1;
}

}
