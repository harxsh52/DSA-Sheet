package stackqueue.stack.practice;
import java.util.*;
public class stockspan {
    public static void stockspan(int stock[],int[] arr){
        Stack<Integer> s=new Stack<>();
        arr[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currPrice=stock[i];
            while(!s.isEmpty() && currPrice>=stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                arr[i]=i+1;
            }else{
                
                arr[i]=i-s.peek();
            }
            s.push(i);
        }
        return;
    }
    public static void main(String[] args) {
        int[] stock={100,80,60,70,60,85,99};
        int[] arr=new int[stock.length];
        stockspan(stock, arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
