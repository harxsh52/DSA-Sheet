package Math;

public class gcd {
    public static void main(String[] args) {
        int t=GCD(9,6);
        System.out.println(t);
    }
    public static int GCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }