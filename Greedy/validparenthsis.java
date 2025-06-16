package Greedy;

import java.util.Stack;

public class validparenthsis {
    public boolean checkValidString(String s) {
        Stack<Integer> stack_open=new Stack<>();
        Stack<Integer> stack_star=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack_open.push(i);
            }else if(s.charAt(i)=='*'){
                stack_star.push(i);
            }else{
                if(!stack_open.isEmpty()){
                    stack_open.pop();
                }else if(!stack_star.isEmpty()){
                    stack_star.pop();
                }else{
                    return false;
                }
            }
        }
        while(!stack_open.isEmpty() && !stack_star.isEmpty()){
            if(stack_open.peek()<stack_star.peek()){
                stack_open.pop();
                stack_star.pop();
            }else{
                 break;
            }
        }
        return stack_open.isEmpty();
    }
}
