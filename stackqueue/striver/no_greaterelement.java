package stackqueue.striver;

import java.util.HashMap;

public class no_greaterelement {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    map.put(i,map.getOrDefault(i,0)+1);
                }
            }
        }
        int[] arr1=new int[queries];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=map.getOrDefault(indices[i],0);
        }
        return arr1;
    }
}
