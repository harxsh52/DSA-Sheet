package Recursion.logicbuilding.pick_notpick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_II {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> w=new ArrayList<>();
        genrate(w,nums,new ArrayList<>(),0);
        return w;
    }
    public static void genrate(List<List<Integer>> w,int[] nums,List<Integer> current,int index){
        if(index==nums.length){
            w.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        genrate(w,nums,current,index+1);
        current.remove(current.size()-1);
        while(index +1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        genrate(w,nums,current,index+1);
    }
}

