package stackqueue.queue.practice;

public class queuearraylist {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("All ready empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear-=1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue w=new Queue(5);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);

        while(!w.isEmpty() ){
            System.out.println(w.remove());
        }
    }
}
