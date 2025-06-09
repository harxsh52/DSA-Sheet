package stackqueue.practice;
import java.util.Stack;
public class pushAtbottom {
    public static void pushatbottom(Stack<Integer> stack,int value){
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        int top=stack.pop();
        pushatbottom(stack,value);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        pushatbottom(stack, 3);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
