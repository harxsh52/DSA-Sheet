package Math;

public class prime {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }
        public static boolean isPrime(int n) {
              //your code goes here
              if (n <= 1) return false;
    
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
    
            return true;
        }
    }

