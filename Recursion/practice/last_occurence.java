package Recursion.practice;

public class last_occurence {
    public static int last_occurence(int[] arr,int key,int i){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return last_occurence(arr, key, i-1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,6,7};
        int t=last_occurence(arr, 5, arr.length-1);
        System.out.println(t);
    }
}
