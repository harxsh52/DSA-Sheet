package DynamicProgramming.DP3;

public class ninja {
    public int maximumPoints(int arr[][]) {
        // code here
        int[][] dp=new int[arr.length][4];
        dp[0][0]=Math.max(arr[0][1],arr[0][2]);
        dp[0][1]=Math.max(arr[0][0],arr[0][2]);
        dp[0][2]=Math.max(arr[0][1],arr[0][0]);
        for(int i=1;i<arr.length;i++){
            for(int prev=0;prev<4;prev++){
                dp[i][prev]=0;
                for(int task=0;task<3;task++){
                    if(task!=prev){
                        int activity=arr[i][task]+dp[i-1][task];
                        dp[i][prev]=Math.max(dp[i][prev],activity);
                    }
                }
            }
        }
        return dp[arr.length-1][3];
    }
}
