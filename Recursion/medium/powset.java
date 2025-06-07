package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class powset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        genrate(nums,0,result,new ArrayList<>());
        return result;
    }
    public static void genrate(int[] nums,int i,List<List<Integer>> result,List<Integer> current){
        if(i==nums.length){
            result.add(new ArrayList<>(current));
            return;}
            genrate(nums,i+1,result,current);
            current.add(nums[i]);
            genrate(nums,i+1,result,current);
            current.remove(current.size()-1);
    }
}
