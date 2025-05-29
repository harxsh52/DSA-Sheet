package Array.medium;

import java.util.HashMap;

public class majorityelement {
public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> result=new HashMap<>();
        for(int num:nums){
            result.put(num,result.getOrDefault(num,0)+1);
            if(result.get(num)>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}
