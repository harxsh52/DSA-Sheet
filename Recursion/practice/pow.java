package Recursion.practice;

public class pow {
    public static long power(long x, long n) {
    if (n == 0) return 1;

    long half = power(x, n / 2);

    if (n % 2 == 0) {
        return half * half;
    } else {
        return half * half * x;
    }
}
public static void main(String[] args) {
    long t=power(2,10);
    System.out.println(t);
}
}
