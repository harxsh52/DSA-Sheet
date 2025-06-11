package stackqueue.queue.practice;
import java.util.*;

public class reverse {
    public static void Reverse(Queue<Integer> q,int k){
        if(k==0){
            return;
        }
        int top=q.remove();
        Reverse(q,k-1);
        q.add(top);

    }public static void kreverse(Queue<Integer> q,int k){
        Reverse(q, k);
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        return;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        kreverse(q,5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
