package Recursion.logicbuilding.pick_notpick;

import java.util.ArrayList;

public class subset_sum {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> w=new ArrayList<>();
        
        genrate(arr,w,0,0);
        return w;
    }
    public static void genrate(int[] arr,ArrayList<Integer> w,int sum,int i){
        if(i==arr.length){
            w.add(sum);
            return;
        }
        genrate(arr,w,sum,i+1);
        sum+=arr[i];
        genrate(arr,w,sum,i+1);
        sum-=arr[i];
    }
}
