package DynamicProgramming.DP1;
import java.util.*;
public class climbing3 {
    // memoization
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int climb(int n,int[] dp){
        if(n <= 1) {
            return 1;
        }
        if(n==2){
            return 2; // 2 ways to climb 2 steps: (1+1) or (2)
        }
        if(dp[n] != -1) {
            return dp[n];   
        }
        dp[n] = climb(n-1, dp) + climb(n-2, dp) +climb(n-3, dp);    
        return dp[n];
    }
    //Tabular 
    public static int climb(int n){
        int[] dp= new int[n + 1];
        dp[0] = 1; // 1 way to stay at the ground
        dp[1] = 1; // 1 way to take one step
        dp[2] = 2; // 2 ways to climb 2 steps:
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]; // sum of ways to climb (i-1), (i-2), and (i-3) steps
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(climb(n, dp));
        sc.close();
    }
}
