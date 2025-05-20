package binarysearch;

public class largestodd {
    public String largestOddNumber(String num) {
        // Traverse from end to find the rightmost odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    """ public String largestOddNumber(String num) {
       int index=-1;
        index=Math.max(num.lastIndexOf('1'),index);
        index=Math.max(num.lastIndexOf('3'),index);
        index=Math.max(num.lastIndexOf('5'),index);
        index=Math.max(num.lastIndexOf('7'),index);
        index=Math.max(num.lastIndexOf('9'),index);
        num=num.substring(0,index+1);
        return num;
    }"""
}
