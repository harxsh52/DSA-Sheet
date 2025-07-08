package DynamicProgramming.DP1;
import java.util.*;
import java.util.Arrays;;
public class fibonnaci {
    public static int fib(int n){
        Arrays.fill(dp, -1);
        dp[0]= 0;
        dp[1]= 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    static int[] dp = new int[100000];
    public static int fib(int n,int[] dp) {
    if (n <= 1) {
        return n;
    }
    if (dp[n] != -1) {
        return dp[n];
    }
    dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return fib(n-1, dp) + fib(n-2, dp);
    }
        public static void main(String[] args) {
            Arrays.fill(dp, -1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int th = fib(n);
        System.out.println(th);
        sc.close();
    }
}
