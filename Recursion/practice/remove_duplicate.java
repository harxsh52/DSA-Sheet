package Recursion.practice;

import java.util.HashSet;

public class remove_duplicate {
    public static void Stringduplicate(String s,int i,StringBuilder t,HashSet<Character> seen){
        if(i==s.length()){
            System.out.print(t.toString());
            return;
        }
        char e=s.charAt(i);
        if(!seen.contains(e)){
            seen.add(e);
            t.append(e);
        }
        Stringduplicate(s, i+1, t, seen);
        return;
    }
    public static void main(String[] args) {
        String s="fffuuuuuuuccccccckkkkkk";
        Stringduplicate(s,0,new StringBuilder(),new HashSet<>());
    }
}
