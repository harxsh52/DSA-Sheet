package stackqueue.practice;
import java.util.*;

public class nextgreaterelement {
    public static void nextgreaterelement(int[] arr,int[]arr1){
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                arr1[i]=-1;
            }
            else{
                arr1[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return;
    }
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        int[] arr1=new int[arr.length];
        nextgreaterelement(arr, arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
