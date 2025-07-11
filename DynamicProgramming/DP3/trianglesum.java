package DynamicProgramming.DP3;

import java.util.List;

public class trianglesum {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 1) return triangle.get(0).get(0);

        int m = triangle.size();
        int[][] dp = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = triangle.get(i).get(j);
                    continue;
                }

                int curr = triangle.get(i).get(j);
                int upLeft = Integer.MAX_VALUE, up = Integer.MAX_VALUE;

                if (j > 0) {
                    upLeft = dp[i - 1][j - 1];
                }
                if (j < i) {
                    up = dp[i - 1][j];
                }

                dp[i][j] = Math.min(up, upLeft) + curr;
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int val : dp[m - 1]) {
            ans = Math.min(ans, val);
        }

        return ans;
    }
}
