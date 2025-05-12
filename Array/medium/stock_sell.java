package Array.medium;

public class stock_sell {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int num:prices){
            if(num<min){
                min=num;
            }
            max=Math.max(max,num-min);
        }
        return max;
    }
}
