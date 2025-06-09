package stackqueue.practice;
import java.util.*;

public class validparenthiss {
    public static boolean check(String ss){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<ss.length();i++){
             char ch = ss.charAt(i);
             if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
             }else{
                if(s.isEmpty()){
                    return false;
                }
                else{
                    if((s.peek()=='(' && ch==')')||(s.peek()=='{' && ch=='}')||(s.peek()=='[' && ch==']')){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
             }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String s="({[])";
        boolean e=check(s);
        System.out.println(e);
    }
}
