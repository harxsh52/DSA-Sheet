package stackqueue.queue.practice;
import java.util.*;

public class maximum_subarray {
    public static int[] maximum(int[] arr,int k){
        int[]arr1 =new int[arr.length-k+1];
        if(k==1 || arr.length<=1) return arr;
        for(int i=0;i<arr.length-k+1;i++){
            int t=check(arr,i,k);
            arr1[i]=t;
        }
        return arr1;
    }
    public static int check(int[] arr,int i,int k){
        Queue<Integer> q=new LinkedList<>();
        while(k>0){
            if(q.isEmpty()){
                q.add(arr[i]);
            }else{
                if(q.peek()<arr[i]){
                    while(!q.isEmpty() && q.peek()<arr[i]){
                    q.remove();
                }
                q.add(arr[i]);
                }
            }
            i++;
            k--;
        }
        return q.peek();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,4,5,2,3,6};
        int[] arr1=maximum(arr, 3);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
