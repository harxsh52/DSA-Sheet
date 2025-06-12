package stackqueue.striver;

import java.util.Arrays;
import java.util.Stack;

public class nextgreaterelementII {
    public int[] nextGreaterElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<2*(nums.length)-1;i++){
            int t=i%nums.length;
            while(!s.isEmpty() && nums[t]>nums[s.peek()]){
                int index=s.pop();
                arr[index]=nums[t];

            }
            s.push(t);
        }
        return arr;
}}
