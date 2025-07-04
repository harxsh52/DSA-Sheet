package String.hard;

import java.util.ArrayList;
import java.util.List;

public class rabin_krap {
    public static List<Integer> search(String pat, String txt) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        String sb=new String(pat);
        while(sb.length()>txt.length()){
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
