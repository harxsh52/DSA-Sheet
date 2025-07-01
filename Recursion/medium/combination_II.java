package Recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
        genrate(arr,target-arr[i],i+1,result,list);
        list.remove(list.size()-1);
        while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
        }
        genrate(arr,target,i+1,result,list);
    }
}
