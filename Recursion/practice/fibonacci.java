package Recursion.practice;

public class fibonacci {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static boolean ischeck(int[] arr,int i){
        if(arr.length-1==i){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return ischeck(arr,i+1);

    }
    public static void main(String[] args) {
        int t=fibo(4);
        System.out.println(t);
    }
}
