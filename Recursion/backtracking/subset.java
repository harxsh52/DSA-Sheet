package Recursion.backtracking;

public class subset {
    public static void subset(String s,int i,int j){
        if(i==s.length()){
            return;
        }
        if(j==s.length()){
            subset(s,i+1,i+1);
            return;
        }
        System.out.println(s.substring(i, j+1));
        subset(s, i, j+1);
    }

    //subset
    public static void subSet(String s,int i,String q){
        if(i==s.length()){
            if(q.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(q);
            }
            return;
        }
        subSet(s,i+1,q);
        subSet(s,i+1,q+s.charAt(i));
    }
    public static void main(String[] args) {
        subset("123",0,0);
        System.out.println("next");
        subSet("abc", 0, "");
    }
}
