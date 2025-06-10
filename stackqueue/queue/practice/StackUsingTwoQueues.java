package stackqueue.queue.practice; // Keeping your package structure

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

    // Using Java's built-in Queue interface implemented by LinkedList
    private Queue<Integer> q1; // Main queue where elements are kept in stack order
    private Queue<Integer> q2; // Helper queue for reordering elements during push

    // Constructor to initialize the queues
    public StackUsingTwoQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /**
     * Pushes an element onto the stack.
     * This operation is costly as it reorders elements.
     * Time Complexity: O(N) where N is the number of elements in the stack.
     */
    public void push(int data) {
        // 1. Add the new element to q2
        q2.add(data);

        // 2. Move all existing elements from q1 to q2
        //    This ensures the new element is at the 'front' of q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // 3. Swap the names of q1 and q2.
        //    Now q1 contains all elements with the new one at its front.
        Queue<Integer> temp = q1; // Store reference to q1
        q1 = q2;                  // q1 now points to what was q2 (new element at front)
        q2 = temp;                // q2 now points to the old q1 (which is empty after moving elements)
    }

    /**
     * Removes and returns the top element of the stack.
     * Time Complexity: O(1)
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Or throw an exception
        }
        return q1.remove(); // The top element is always at the front of q1
    }

    /**
     * Returns the top element of the stack without removing it.
     * Time Complexity: O(1)
     */
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1; // Or throw an exception
        }
        return q1.peek(); // The top element is always at the front of q1
    }

    /**
     * Checks if the stack is empty.
     * Time Complexity: O(1)
     */
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    /**
     * Prints the elements of the stack from top to bottom.
     */
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack (Top -> Bottom): " + q1);
    }

    public static void main(String[] args) {
        StackUsingTwoQueues myStack = new StackUsingTwoQueues();

        System.out.println("Is stack empty? " + myStack.isEmpty()); // true

        System.out.println("\n--- Pushing elements ---");
        myStack.push(10);
        myStack.printStack(); // Stack: [10]

        myStack.push(20);
        myStack.printStack(); // Stack: [20, 10]

        myStack.push(30);
        myStack.printStack(); // Stack: [30, 20, 10]

        System.out.println("\nTop element: " + myStack.top()); // 30
        System.out.println("Is stack empty? " + myStack.isEmpty()); // false

        System.out.println("\n--- Popping elements ---");
        System.out.println("Popped: " + myStack.pop()); // 30
        myStack.printStack(); // Stack: [20, 10]

        System.out.println("Popped: " + myStack.pop()); // 20
        myStack.printStack(); // Stack: [10]

        System.out.println("\nTop element: " + myStack.top()); // 10

        System.out.println("Popped: " + myStack.pop()); // 10
        myStack.printStack(); // Stack is empty.

        System.out.println("\nIs stack empty? " + myStack.isEmpty()); // true
        myStack.pop(); // Attempt to pop from empty stack
    }
}
