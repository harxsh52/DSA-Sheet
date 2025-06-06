package Recursion.backtracking;

public class nextpermutaions {
    public static void nextPermutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String ws=s.substring(0,i)+s.substring(i+1);
            nextPermutation(ws, ans+c);
        }
    }
    public static void main(String[] args) {
        nextPermutation("abc", "");
    }
}
