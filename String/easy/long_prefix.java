package String.easy;

public class long_prefix {
    public String longestCommonPrefix(String[] strs) {
        String prev = strs[0];
        for (int i=0; i<strs.length; i++) {
            while (strs[i].indexOf(prev)!=0) {
                prev = prev.substring(0, prev.length()-1);
            }
            
        }
        return prev;
    }
}
