package stackqueue.striver;

import java.util.Stack;

public class immdediate_smaller {
    public void immediateSmaller(int arr[]) {
        // code here
        Stack<Integer> s=new Stack<>();
        int[] arr1=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(s.isEmpty()){
                arr1[i]=-1;
            }
            else{
                if(s.peek()<arr[i]){
                    arr1[i]=s.peek();
                }else{
                    arr1[i]=-1;
                }
            }
            s.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr1[i];
        }
        return;
    }
}
