package stackqueue.striver;

import java.util.HashMap;
import java.util.Stack;

public class nextgreaterelementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[nums2.length];
        int[] arr1=new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        Stack<Integer> S1=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!S1.isEmpty() && nums2[i]>S1.peek()){
                S1.pop();
            }
            if(S1.isEmpty()){
                arr[i]=-1;
            }else{
                arr[i]=S1.peek();
            }
            S1.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            arr1[i]=arr[map.get(nums1[i])];
        }
        return arr1;
    }
}
