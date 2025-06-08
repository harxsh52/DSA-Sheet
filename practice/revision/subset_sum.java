package practice.revision;

import java.util.ArrayList;

public class subset_sum {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        genrate(arr,0,0,result);
        return result;
    }
    public static void genrate(int[] arr,int i,int sum,ArrayList<Integer> result){
        if(i==arr.length){
            result.add(sum);
            return;
        }
        genrate(arr,i+1,sum,result);
        sum+=arr[i];
        genrate(arr,i+1,sum,result);
        sum-=arr[i];
    }
}
