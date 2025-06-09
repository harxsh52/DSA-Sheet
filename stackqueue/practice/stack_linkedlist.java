package stackqueue.practice;

public class stack_linkedlist {
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        private ListNode head;

        public Stack(){
            head=null;
        }
        public void push(int value){
            ListNode newNode=new ListNode(value);
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            if(head==null){
                throw new EmptyStackException();
            }
            int value=head.data;
            head=head.next;
            return value;
        }
        public int peek(){
            if(head==null){
                throw new EmptyStackException();
            }
            return head.data;
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
    }
}
