package language.Recursion;

    public class Fibonacci {
        public static int fibonacci(int n) {
            if (n <= 1) return n; // base cases: fib(0) = 0, fib(1) = 1
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive step
        }
    
        public static void main(String[] args) {
            int n = 6; // Example: 0 1 1 2 3 5 8 → fib(6) = 8
            System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
        }
    }
