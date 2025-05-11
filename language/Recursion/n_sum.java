package language.Recursion;

public class n_sum {
        public static int NnumbersSum(int N) {
            if (N <= 0) return 0;         // base case
            return N + NnumbersSum(N - 1); // recursive case
        }
        public static void main(String[] args) {
            System.out.println(NnumbersSum(4));
        }
    }
    
