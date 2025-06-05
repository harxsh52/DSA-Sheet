package Recursion.striver easy;

public class pow {
    public double myPow(double x, int r) {
        long n = r; // To avoid overflow with Integer.MIN_VALUE
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return power(x, n);
    }

    private double power(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
