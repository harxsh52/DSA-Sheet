package DynamicProgramming;
import java.util.*;
import java.util.Arrays;;
public class fibonnaci {
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
        int th = fib(n, dp);
        System.out.println(th);
        sc.close();
    }
}
