package stack_queue.practice;

public class stack_linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node top;

        public Stack() {
            top = null;
        }

        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (top == null) {
                throw new EmptyStackException();
            }
            int value = top.data;
            top = top.next;
            return value;
        }

        public int peek() {
            if (top == null) {
                throw new EmptyStackException();
            }
            return top.data;
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
    public static class EmptyStackException extends RuntimeException {
        public EmptyStackException() {
            super("Stack is empty");
        }
    
}}
