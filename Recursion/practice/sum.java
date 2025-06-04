package Recursion.practice;

public class sum {
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return Sum(n-1)+n;
    }
    public static void main(String[] args) {
        int t=Sum(8);
        System.out.println(t);
    }
}
