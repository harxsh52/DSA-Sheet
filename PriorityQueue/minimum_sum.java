package PriorityQueue;
import java.util.*;

public class minimum_sum {
    public static void main(String[] args) {
        int[] arr={3,3,4,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int q:arr){
            pq.add(q);
        }
        int cost=0;
        while(pq.size()>1){
            int r=pq.remove();
            int q=pq.remove();
            int max=r+q;
            cost+=max;
            pq.add(max);
        }
        System.out.println(cost);

    }
}
