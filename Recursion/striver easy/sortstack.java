package Recursion.striver easy;
import java.util.*;

public class sortstack {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()){
            return s;
        }
        int top=s.pop();
        sort(s);
        InsertSort(s,top);
        return s;
        
        
    }
    public void InsertSort(Stack<Integer> s,int t){
        if(s.isEmpty() || s.peek()<=t){
            s.push(t);
            return;
            
        }
        int top=s.pop();
        InsertSort(s,t);
        s.push(top);
    }
}
