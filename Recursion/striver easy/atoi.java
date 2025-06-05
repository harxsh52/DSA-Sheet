package Recursion.striver easy;

public class atoi {
    public int myAtoi(String str) {
        str=str.trim();
        long num=0;
        int i=0,sign=1;
        if(str.isEmpty()) return 0;
        if(str.charAt(i)== '-'){
            sign=-1;
            i++;
        }else if(str.charAt(i)=='+'){
            i++;
        }
        while(i<str.length() && Character.isDigit(str.charAt(i))){
            num=num*10+(str.charAt(i)-'0');
            if(num*sign >Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(num*sign <Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(num*sign);
}}
