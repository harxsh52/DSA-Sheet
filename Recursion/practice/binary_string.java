package Recursion.practice;

public class binary_string {
    public static void binary_string(int lp,int n,StringBuilder s){
        if(n==0){
            System.out.println(s.toString());
            return;
        }
        binary_string(0, n-1, s.append("0"));
        s.deleteCharAt(s.length() - 1);
        if(lp==0){
            binary_string(1, n-1, s.append("1"));
            s.deleteCharAt(s.length() - 1);
        }
    }
    public static void main(String[] args) {
        binary_string(0, 3, new StringBuilder());
    }
}
