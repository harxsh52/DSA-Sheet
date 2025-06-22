package PriorityQueue;
import java.util.*;

public class pqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(3);
        pq.add(1);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
        System.out.println("ReverseOrder");

        //storing in reverse
        //Important Comparator.reverseOrder()
        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
         p.add(3);
         p.add(2);
         p.add(1);
         while(!p.isEmpty()){
            System.out.println(p.remove());
         }
    }

}
