package Recursion.practice;

public class first_occurence {
    public static int first_occur(int[] arr,int i,int key){
        if(i==arr.length){
            return -1;
        }
        
        if(arr[i]==key){
            return i;
        }
        return first_occur(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2 ,3,4,5,5,6};
        int t=first_occur(arr, 0, 5);
        System.out.println(t);
    }
}
