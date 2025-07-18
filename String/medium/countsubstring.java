package String.medium;

public class countsubstring {
    public static int countSubstring(String s) {
        // code here
        int count=0,left=0;
        int[] freq=new int[3];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+=(s.length()-right);
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }
        return count;
    }
}
