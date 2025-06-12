package stackqueue.stack.practice;
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
    /*
    class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack[++top] = ')';
            } else if (c == '{') {
                stack[++top] = '}';
            } else if (c == '[') {
                stack[++top] = ']';
            } else {
                if (top == -1 || stack[top--] != c) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}
     */
}
