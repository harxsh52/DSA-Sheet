package Recursion.practice;

public class increase_order {
    public static void increasing_order(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        increasing_order(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        increasing_order(5);
    }
}
