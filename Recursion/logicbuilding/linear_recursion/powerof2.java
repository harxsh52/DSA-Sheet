package Recursion.logicbuilding.linear_recursion;

public class powerof2 {
    public static boolean isPowerOfTwo(int n) {
        // Base case
        if (n == 1) return true;
        if (n == 0 || n % 2 != 0) return false;
        
        // Recursive case
        return isPowerOfTwo(n / 2);
    }
    public static void main(String[] args) {
        boolean t=isPowerOfTwo(1022);
        System.out.print(t);
    }
}
