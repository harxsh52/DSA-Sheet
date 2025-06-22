package PriorityQueue;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class handofStraight {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length==0 || hand.length%groupSize!=0){
            return false;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        TreeMap<Integer,Integer> q=new TreeMap<>();
        for(int val:hand){
            q.put(val,q.getOrDefault(val,0)+1);
        }
        while(!q.isEmpty()){
            int lowestcard=q.firstKey();
            for(int i=0;i<groupSize;i++){
                int f=lowestcard+i;
                if(!q.containsKey(f)){
                    return false;
                }
                q.put(f,q.get(f)-1);
                if(q.get(f)==0){
                    q.remove(f);
                }
            }
        }

        return true;
    }
}
