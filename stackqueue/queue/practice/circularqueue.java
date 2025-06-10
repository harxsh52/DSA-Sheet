package stackqueue.queue.practice;

public class circularqueue {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int value){
            if(isFull()){
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=value;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            
            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue w=new Queue(5);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        System.out.println(w.remove());
        Queue.add(4);
        System.out.println(w.remove());

        while(!w.isEmpty() ){
            System.out.println(w.remove());
        }
    }
}
