import java.util.*;
public class practice {
    public static int secondLargest(int[] arr){
        int first=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else{
                if(arr[i]>second && arr[i]<first){
                    second=arr[i];
                }
            }
        }
        return second==Integer.MIN_VALUE? -1 : second;
    }
    public static int perfectSum(int[] num, int k) {
        int n = num.length;

        int[][] dp = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        if (num[0] <= k) {
            dp[0][num[0]]+=1;
        }

        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= k; target++) {
                int notTaken = dp[ind - 1][target];

                int taken = 0;
                if (num[ind] <= target) {
                    taken = dp[ind - 1][target - num[ind]];
                }

                dp[ind][target] = notTaken + taken;
            }
        }

        return dp[n - 1][k];
    }
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int secondlargest =secondLargest(arr);
        int result=perfectSum(arr, 24);
        System.out.println(result);
        sc.close();
    }


     }
