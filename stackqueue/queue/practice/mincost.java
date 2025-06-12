package stackqueue.queue.practice;

import java.util.PriorityQueue;

public class mincost {
    public static int minCost(int[] arr) {
        // code here
        if(arr.length<=1){
            return 0;
        }
        long realsum=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long t:arr){
            pq.add(t);
        }
        long sum=0;
        while(pq.size()>1){
            long first=pq.poll();
            long second=pq.poll();

            sum=first+second;
            realsum+=sum;
            
            pq.add(sum);
        }
        return (int)realsum;
    }
}
