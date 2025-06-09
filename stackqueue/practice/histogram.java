package stackqueue.practice;
import java.util.*;

public class histogram {


    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] NSL = new int[n]; // Nearest Smaller to Left
        int[] NSR = new int[n]; // Nearest Smaller to Right

        Stack<Integer> stack = new Stack<>();

        // Step 1: Compute NSL
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            NSL[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Clear stack for NSR calculation
        stack.clear();

        // Step 2: Compute NSR
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            NSR[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Step 3: Calculate max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = NSR[i] - NSL[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Max Area = " + largestRectangleArea(heights)); // Output: 10
    }
}
