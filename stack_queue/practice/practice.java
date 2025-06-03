package stack_queue.practice;
import java.util.*;

public class practice {
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
    }
}
