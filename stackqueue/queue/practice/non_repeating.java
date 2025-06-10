package stackqueue.queue.practice;
import java.util.*;

public class non_repeating {
    public static void non_repeating(String str){
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }

        }
        System.out.println(q.peek());
        return;
    }
    public static void main(String[] args) {
        String str="aabbxxxsx";
        non_repeating(str);

    }
}
