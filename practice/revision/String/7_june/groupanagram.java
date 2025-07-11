package practice.revision.String.7_june;
import java.util.*;

public class groupanagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ans=new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
