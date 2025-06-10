package stackqueue.stack.practice;

import java.util.ArrayList;

public class StackArrayList {
    
    // Inner static Stack class
    static class Stack {
        private ArrayList<Integer> stack;

        // Constructor
        public Stack() {
            stack = new ArrayList<>();
        }

        // Push element onto the stack
        public void push(int value) {
            stack.add(value);
        }

        // Pop element from the stack
        public int pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.remove(stack.size() - 1);
        }

        // Peek the top element
        public int peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.get(stack.size() - 1);
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);

        System.out.println(stack.peek()); // Output: 20
        System.out.println(stack.pop());  // Output: 20
        System.out.println(stack.pop());  // Output: 10

        // Uncomment to test exception
        // System.out.println(stack.pop()); // Will throw EmptyStackException
    }
    public static class EmptyStackException extends RuntimeException {
        public EmptyStackException() {
            super("Stack is empty");
        }
    }
}
