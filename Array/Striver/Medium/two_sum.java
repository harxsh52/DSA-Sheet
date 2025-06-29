package Array.Medium;

import java.util.HashMap;

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> result=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(result.containsKey(target-nums[i])){
                return new int[] {result.get(target-nums[i]),i};
            }
            else{
                result.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}
