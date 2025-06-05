package Recursion.striver easy;
import java.util.*;

public class reversestack {
    public static void pushAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        
        int topValue = stack.pop();
        pushAtBottom(stack, value);
        stack.push(topValue);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top=stack.pop();
        reverse(stack);
        pushAtBottom(stack, top);
    }
}
