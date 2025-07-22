
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class string {
    public static List<Integer> search(String pat, String txt) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        String sb=new String(pat);
        while(sb.length()>=txt.length()){
           int t=sb.indexOf(txt);
           if(t==-1){
            break;
           }
           list.add(count+t);
           count+=t+txt.length();
           if(count>=pat.length()){
            break;
           }
           sb=pat.substring(count);
        }
        return list;
    }
        
    public static void main(String[] args) {

        // Creating an empty HashMap
        Scanner sc=new Scanner(System.in);
        String pat=sc.next();
        sc.nextLine();
        String txt=sc.next();
        List<Integer> m = search(pat,txt);

        // Using keySet() to get the set view of keys;
        for(int val: m) {
            System.out.print(val+" ");
        }
        sc.close();
    }
}