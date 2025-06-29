package Array.Striver.Hard;

import java.util.HashMap;
import java.util.Map;

public class subarrayXork {
    public int subarraysWithXorK(int[] nums, int k) {
      int xorSum=0;
      int count=0;
      Map<Integer,Integer> map=new HashMap<>();
      for(int val:nums){
        xorSum^=val;
        if(xorSum==k){
            count++;
        }
        count+=map.getOrDefault(xorSum^k,0);
        map.put(xorSum,map.getOrDefault(xorSum,0)+1);
      }
      return count;
    }
}
