package practice.revision.String;

public class palindorme_substring {
    public String longestPalindrome(String s) {
        if(s.length()==0)return "";
        if(s.length()==1)return s;
        String longest=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=i;j--){
                if(j-i+1>=longest.length()){
                    if(check(s.substring(i,j+1))){
                        longest=s.substring(i,j+1);
                        break;
                    }
                }
            }
        }
        return longest;
    }
    public static boolean check(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
