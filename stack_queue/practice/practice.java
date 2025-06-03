package stack_queue.practice;
import java.util.*;

public class practice {

    //Stack valid parentheses
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='[')){
                    return false;
                }
            }
        }
                    if(stack.isEmpty()) {
                return true; // All parentheses matched
            }
            return false; // Some parentheses are unmatched
    }
    //function to reverse a string using stack
    public static void reverseStringUsingStack(String str) {
        Stack<Character> stack= new Stack<>();
        // Check if the string is empty

        if (str == null || str.isEmpty()) {
            System.out.println("Reversed String: " + str);
            return;
        }
        // Push all characters to stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        // Pop characters from stack to form the reversed string
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        System.out.println("Reversed String: " + reversedStr.toString());
        
    }
    //Function reverses a stack using recursion
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, temp);
    }

    //Next Greater element
    public static void nextGreaterElement(int[] arr) {
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=-1;
            }else{
                result[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        System.out.println("Next Greater Element: " + Arrays.toString(result));
    }
    // Function to push an element at the bottom of the stack
    // using recursion
    public static void pushAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        
        int topValue = stack.pop();
        pushAtBottom(stack, value);
        stack.push(topValue);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack before pushing at bottom: " + stack);
        
        pushAtBottom(stack, 5);
        
        System.out.println("Stack after pushing 5 at bottom: " + stack);
        String str = "Hello, World!";
        reverseStringUsingStack(str);
        // Example usage of reverseStringUsingStack    
        System.out.println("Reversed String: " + str);
        int[] arr = {4, 5, 2, 10, 8};

        nextGreaterElement(arr);
        isValid("()[]{}"); // Example usage of isValid
        System.out.println("Is valid parentheses: " + isValid("()[]{"));
    }
}
