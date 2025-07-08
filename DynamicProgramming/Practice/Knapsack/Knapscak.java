package DynamicProgramming.Practice.Knapsack;

public class Knapscak {
    public static int knapsackt(int[] values,int[] weights,int w,int n){
        if(n==0 ||w==0){
            return 0;
        }
        if(weights[n-1]<=w){
            int ans1=values[n-1]+knapsackt(values,weights,w-weights[n-1],n-1);
            int ans2=knapsackt(values,weights,w,n-1);
            return Math.max(ans1,ans2);
        }else{
            return knapsackt(values,weights,w,n-1);
        }
    }
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int w = 50;
        int n = values.length;
        System.out.println("Maximum value in Knapsack = " + knapsackt(values, weights, w, n));
    }
}
