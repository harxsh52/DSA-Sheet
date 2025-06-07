package practice.revision.recursion.linearrecursion;

//7 june
//Linear Recursion
public class n_NUm {
    public static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }
}
