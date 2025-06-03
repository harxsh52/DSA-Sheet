package stack_queue.practice;
import java.util.*;

public class stack_arraylist {
    static  class Stack{
        ArrayList<Integer> stack=new ArrayList<>();
        public Stack() {
            stack = new ArrayList<>();
        }
        public void push(int value) {
            stack.add(value);
        }
        public int pop() {
            if (stack.isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.remove(stack.size() - 1);
        }
        public int peek() {
            if (stack.isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.get(stack.size() - 1);
        }           
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek()); // Output: 20
        System.out.println(stack.pop());  // Output: 20
        System.out.println(stack.pop());  // Output: 10
    }
}
