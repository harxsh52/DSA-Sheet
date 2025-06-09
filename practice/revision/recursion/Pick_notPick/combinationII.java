package practice.revision.recursion.Pick_notPick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,result,new ArrayList<>());
        return result;
    }
    public static void backtrack(int i,int[] arr,int target,List<List<Integer>> result,List<Integer> current){
        if(target==0){
                result.add(new ArrayList<>(current));
            return;
        }
        if(i>=arr.length || target<0){
            return;
        }
        current.add(arr[i]);
        backtrack(i+1, arr, target - arr[i], result, current); // not index+1 because we can reuse
        current.remove(current.size() - 1);
         while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
         }
         backtrack(i + 1, arr, target, result, current);
    }
}
