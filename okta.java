import java.util.*;
public class okta {
    public static void main(String[] args) {
        String s="02:30";
        List<Integer> list = new ArrayList<>();
        String[] st={"12:30","02:30", "03:45", "04:15"};
        int r=intee(s);
        for(int i=0;i<st.length;i++){
            int t=intee(st[i]);
            list.add(t);
            }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            min=Math.min(min,Math.abs(list.get(i)-r));
        }
              System.out.println(min);}


    public static int intee(String s){
        String[] st = s.split(":");
        int h = Integer.parseInt(st[0]);
        if(h==12){
            h=0;
        }
        int m = Integer.parseInt(st[1]);
        return h*60+m;
    }
}