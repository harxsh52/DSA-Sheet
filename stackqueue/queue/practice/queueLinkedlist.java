package stackqueue.queue.practice;

public class queueLinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int value=head.data;
            if(head==tail){
                tail=head=null;
            }else{
                head=head.next;
            }
            return value;
        }
    static void print(){
        Node current=head;
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
        return;
    }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        Queue.print();
    }
}
