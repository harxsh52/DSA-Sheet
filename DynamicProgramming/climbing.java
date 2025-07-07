package DynamicProgramming;
import java.util.*;;
public class climbing {
    //memoization
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // The function calculates the number of distinct ways to climb a staircase with n steps,
    // where you can take either 1 or 2 steps at a time.
    // It uses memoization to store previously computed results in a dp array.
    // The base case is when n is 0 or 1, where there is only one way to climb (either stay at the ground or take one step).
    // For n > 1, it recursively calculates the number of ways to climb by summing the results of climbing n-1 and n-2 steps.
    // The dp array is used to avoid redundant calculations by storing results for each step count.
    // The final result is returned as the number of distinct ways to climb the staircase.
    // The function is called with the total number of steps n and an initialized dp array.
    // The main method reads the number of steps from user input, initializes the dp array,
    // and prints the result of the climb function.
    // Example: If n = 5, the output will be 8, representing the 8 distinct ways to climb a staircase with 5 steps.
    // Example: If n = 5, the output will be 8, representing the 8 distinct ways to climb a staircase with 5 steps.     
    public static int climb(int n,int[] dp){
        if(n <= 1) {
            return 1;
        }
        if(dp[n] != -1) {
            return dp[n];   
        }
        dp[n] = climb(n-1, dp) + climb(n-2, dp);    
        return climb(n-1, dp) + climb(n-2, dp);
        }
    // Tabulation
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int climbTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; // 1 way to stay at the ground
        dp[1] = 1; // 1 way to take one step

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // sum of ways to climb (i-1) and (i-2) steps
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
