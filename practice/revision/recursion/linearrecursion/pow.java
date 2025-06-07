package practice.revision.recursion.linearrecursion;

public class pow {
    public static boolean pow(int n){
        
        if(n==1) return true;
        if(n==0 || n%2!=0)return false;
        return pow(n/2);
    }
    public static void main(String[] args) {
        System.out.println(pow(1026));
    }
}
