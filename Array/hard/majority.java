package Array.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majority {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> sum=new HashMap<>();
        for(int num:nums){
            sum.put(num,sum.getOrDefault(num,0)+1);
            int count=sum.get(num);
            if(count>nums.length/3){
                if(!list.contains(num)){
                    list.add(num);
                }
            }
        }
        return list;
}
}
