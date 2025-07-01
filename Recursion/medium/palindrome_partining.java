package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partining {
    class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtrack(0,s,new ArrayList<>(),result);
        return result;
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
    public void backtrack(int start,String s,List<String> word,List<List<String>> result){
        if(start==s.length()){
            result.add(new ArrayList<>(word));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                word.add(s.substring(start,end+1));
                backtrack(end+1,s,word,result);
                word.remove(word.size()-1);
            }
        }
    }
}
}
