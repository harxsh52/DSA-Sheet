package practice.revision.recursion.linearrecursion;

public class suum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int t=sum(7);
        System.out.println(t);
    }
}
