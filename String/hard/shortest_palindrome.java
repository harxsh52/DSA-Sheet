package String.hard;

public class shortest_palindrome {
    public String shortestPalindrome(String s) {
        if(s.length()==0 || s.isEmpty()) return "";

        int i=0;
        for(int j = s.length()-1; j>=0; j--){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
        }
        if(i==s.length()) return s;

        String suff = s.substring(i);
        String pref = new StringBuilder(suff).reverse().toString();
        String mid = shortestPalindrome(s.substring(0, i));
        return pref + mid + suff;
    }
}
