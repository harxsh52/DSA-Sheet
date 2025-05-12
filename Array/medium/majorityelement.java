package Array.medium;

import java.util.HashMap;
import java.util.Map;

public class majorityelement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> sum=new HashMap<>();
        for(int num:nums){
            sum.put(num,sum.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:sum.entrySet()){
            if(entry.getValue()> nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
