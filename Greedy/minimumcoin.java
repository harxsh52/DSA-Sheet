package Greedy;

import java.util.ArrayList;
import java.util.List;

public class minimumcoin {
    static List<Integer> minPartition(int n) {
        // code here
        int[] arr= { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        
        List<Integer> result=new ArrayList<>();
        while(n>0){
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(n<arr[i]){
                    break;
                }else{
                    max=arr[i];
                }
            }
            result.add(max);
            n-=max;
        }
        return result;
    }
}
