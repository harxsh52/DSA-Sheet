package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class genrate_parenthsis {
    public List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<>();
        genrate(n,"",0,0,s);
        return s;
    }
    public static void genrate(int n,String sq,int open,int close,List<String> s){
        if(sq.length()==n*2){
            s.add(sq);
            return;
        }
        if(open<n){
            genrate(n,sq+'(',open+1,close,s);
        }
        if(close<open){
            genrate(n,sq+')',open,close+1,s);
        }
    }
}
