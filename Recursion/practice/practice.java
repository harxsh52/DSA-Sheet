package Recursion.practice;

public class practice {
    //print the ith value
    public static void count_occur(int[] arr,int i,int key){
        if(arr.length==i){
            return;
        }
        if(arr[i]==key){
            System.out.println(i);
        }
        count_occur(arr, i+1, key);
    }

    //numeric to english
    private static String[] sq={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void conversion_nts(int n,StringBuilder s){
        if(n==0){
            s.append(sq[0]).append(" ");
            return;
        }
        conversion_nts(n/10, s);
        int d=n%10;
        s.append(sq[d]).append(" ");
        
    }

    //String Length
    public static void Length(int i,String s){
        if(i==s.length()){
            System.out.println(i);
            return ;
        }
        Length(i+1,s);

    }
    //another approach
    public static int length(String str) {
       if(str.length() == 0) {
       return 0;
       }
       return length(str.substring(1)) + 1;
} 

//continougs String
private static int count=0;
     public static void continous(String s,int i,int j){
        if(i==s.length()){
            return;
        }
        if(j==s.length()){
            continous(s, i+1, i+1);
            return;
        }
        if(s.charAt(i)==s.charAt(j)){
            System.out.println(s.substring(i,j+1));
            count++;
        }
        continous(s, i, j+1);
     }
    public static void main(String[] args) {
        int[] arr={3,2,4,5,6,2,7,2,2};
        count_occur(arr, 0, 2);
        StringBuilder S=new StringBuilder();
        conversion_nts(1947,  S);
        System.out.println(S.toString());
        String s="aabbaaa";
        continous(s, count, count);
        System.out.println(count);
    }
}
