package stackqueue.queue.practice;
    import java.util.ArrayDeque;
import java.util.Deque;


public class StackAndQueueUsingDeque {
    public static void main(String[] args) {
        // Implementing Stack using Deque
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack after pushes: " + stack);

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pops: " + stack);

        // Implementing Queue using Deque
        Deque<Integer> queue = new ArrayDeque<>();

        // Enqueue elements into the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Queue after enqueues: " + queue);

        // Dequeue elements from the queue
        System.out.println("Dequeued: " + queue.poll());
        System.out.println("Dequeued: " + queue.poll());
        System.out.println("Queue after dequeues: " + queue);
    }

/*import java.util.ArrayDeque;
import java.util.Deque;

public class StackAndQueueUsingDeque {
    public static void main(String[] args) {
        // Implementing Stack using Deque with addFirst
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements onto the stack using addFirst
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);

        System.out.println("Stack after pushes: " + stack);

        // Pop elements from the stack using removeFirst
        System.out.println("Popped: " + stack.removeFirst());
        System.out.println("Popped: " + stack.removeFirst());
        System.out.println("Stack after pops: " + stack);

        // Implementing Queue using Deque
        Deque<Integer> queue = new ArrayDeque<>();

        // Enqueue elements into the queue using addLast
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        System.out.println("Queue after enqueues: " + queue);

        // Dequeue elements from the queue using removeFirst
        System.out.println("Dequeued: " + queue.removeFirst());
        System.out.println("Dequeued: " + queue.removeFirst());
        System.out.println("Queue after dequeues: " + queue);*/
    }
}
}

