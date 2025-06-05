package Recursion.practice;

public class fierned {
    public static int ways(int n){
        if(n==1 || n==2){
            return n;
        }
        return (n-1)+(n-1)*ways(n-2);
    }
    public static void main(String[] args) {
        int t=ways(3);
        System.out.println(t);
    }
}
