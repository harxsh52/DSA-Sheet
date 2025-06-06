package Recursion.logicbuilding.recursion_tree;

import java.util.Arrays;

public class climbing {
    public static int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    public static int helper(int n,int[] dp){
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1)return dp[n];
        return helper(n-1,dp)+helper(n-2,dp);
    }
    public static void main(String[] args) {
        int t=climbStairs(40);
        System.out.println(t);
    }
}
