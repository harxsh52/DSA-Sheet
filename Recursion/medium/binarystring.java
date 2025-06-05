package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class binarystring {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> s=new ArrayList<>();
        genrate(n,"",'0',s);
        return s;
        
    }
    public static void genrate(int n,String sq,char lastplace,List<String> s){
        if(n==0){
            s.add(sq);
            return;
        }
        genrate(n-1,sq+'0','0',s);
        if(lastplace!='1'){
            genrate(n-1,sq+'1','1',s);
        }
    }
}
