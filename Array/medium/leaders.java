package Array.medium;

import java.util.ArrayList;
import java.util.Collections;

public class leaders {
    class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(nums[nums.length-1]);
        int max=nums[nums.length-1];
        for(int i=nums.length-2;i>-1;i--){
            if(nums[i]>max){
                list.add(nums[i]);
                max=nums[i];
            }
        }
         Collections.reverse(list);
        return list;
    }
}
}
