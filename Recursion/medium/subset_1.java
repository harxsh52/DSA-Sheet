package Recursion.medium;
import java.util.ArrayList;
import java.util.List;
public class subset_1 {
    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
        List<Integer> result=new ArrayList<>();
        genrate(result,nums,0,0);
        return result;
    }
    public void genrate(List<Integer> result,int[] nums,int i,int sum){
        if(i==nums.length){
            result.add(sum);
            return;
        }
        sum+=nums[i];
        genrate(result,nums,i+1,sum);
        sum-=nums[i];
        genrate(result,nums,i+1,sum);
    }
}
