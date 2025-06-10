package stackqueue.stack.practice;
import java.util.*;

public class reversestring {
    public static void reverseString(String str){
        if(str.isEmpty() || str==null){
            System.out.println("String is null");
            return;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        StringBuilder s=new StringBuilder();
        while(!stack.isEmpty()){
            s.append(stack.pop());
        }
        s.toString();
        System.out.println(s);
    }

    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int value=stack.pop();
        reverseStack(stack);
        pushAtbottom(stack,value);
    }
    public static void pushAtbottom(Stack<Integer> stack,int value){
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        int val=stack.pop();
        pushAtbottom(stack, value);
        stack.push(val);
    }

    public static void main(String[] args) {
        String ss="helloworld";
        reverseString(ss);
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
