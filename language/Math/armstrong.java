package language.Math;

public class armstrong {
    public static void main(String[] args) {
       System.out.println(isArmstrong(153)); 
    }
        public static boolean isArmstrong(int n) {
           int original = n;
            int digits = (int) Math.log10(n) + 1;
            int sum = 0;
    
            while (n > 0) {
                int digit = n % 10;
                sum += Math.pow(digit, digits);
                n /= 10;
            }
    
            return sum == original;
    
    }
}
