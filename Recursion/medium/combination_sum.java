package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        genrate(candidates,target,0,result,new ArrayList<>());
        return result;
    }
    public void genrate(int[] arr,int target,int i,List<List<Integer>> result,List<Integer> list){
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
            }
        if(i==arr.length || target<0){
            return;
        }
        list.add(arr[i]);
        genrate(arr,target-arr[i],i,result,list);
        list.remove(list.size()-1);
        genrate(arr,target,i+1,result,list);
    }
}
