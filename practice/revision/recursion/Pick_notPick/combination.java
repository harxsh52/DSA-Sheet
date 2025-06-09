package practice.revision.recursion.Pick_notPick;

import java.util.ArrayList;
import java.util.List;

public class combination {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(0,candidates,target,result,new ArrayList<>());
        return result;
    }
    public static void backtrack(int i,int[] arr,int target,List<List<Integer>> result,List<Integer> current){
        if(i==arr.length && target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(i>=arr.length ||target<0){
            return;
        }
        backtrack(i + 1, arr, target, result, current);
        current.add(arr[i]);
        backtrack(i,arr,target-arr[i],result,current);
        current.remove(current.size()-1);
    }
    
}
