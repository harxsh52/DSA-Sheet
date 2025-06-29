package Array.Medium;

public class stock_sell {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int num:prices){
            if(min>num){
                min=num;
            }
            max=Math.max(max,num-min);
        }
        return max;
    }
}
