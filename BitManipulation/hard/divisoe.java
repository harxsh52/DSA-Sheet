package BitManipulation.hard;

public class divisoe {
    public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE; // Handle overflow case
    }

    // Convert to long to avoid overflow
    long a = Math.abs((long) dividend);
    long b = Math.abs((long) divisor);
    int result = 0;

    for (int i = 31; i >= 0; i--) {
        // Check if (b << i) fits into current a
        if ((b << i) <= a) {
            a -= (b << i);
            result += (1 << i);
        }
    }

    // Apply sign
    return ((dividend > 0) == (divisor > 0)) ? result : -result;
}
    public static void main(String[] args) {
        divisoe d = new divisoe();
        System.out.println(d.divide(10, 2)); // Output: 5
        System.out.println(d.divide(7, -3)); // Output: -2
        System.out.println(d.divide(-10, -2)); // Output: 5
        System.out.println(d.divide(Integer.MIN_VALUE, -1)); // Output: 2147483647 (overflow case)
    }
}
