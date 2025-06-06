package Recursion.logicbuilding.pick_notpick;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sq=new ArrayList<>();
        genrate(sq,0,new ArrayList<>(),nums);
        return sq;
    }
    public static void genrate(List<List<Integer>> sq,int index,List<Integer> s,int[] nums){
        if(index==nums.length){
            sq.add(new ArrayList<>(s));
            return;
        }
        genrate(sq,index+1,s,nums);
        s.add(nums[index]);
        genrate(sq,index+1,s,nums);
        s.remove(s.size()-1);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> w=subsets(nums);
        for(List<Integer> num:w){
            System.out.println(num);
        }
    }
}
