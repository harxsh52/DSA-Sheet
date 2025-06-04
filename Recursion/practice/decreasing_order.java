package Recursion.practice;

public class decreasing_order {
    public static void decreasing_Order(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        decreasing_Order(n-1);
    }
    public static void main(String[] args) {
        decreasing_Order(5);
    }
}
