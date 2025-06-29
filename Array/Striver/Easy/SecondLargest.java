

// Given an array of integers, find the second largest element in the array.

public class SecondLargest {
     public static int getSecondLargest(int[] arr) {
        // code here
        int max1=arr[0];
        int max2=-1;
        for(int i=1;i<arr.length;i++){
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }else if(max2<arr[i] && arr[i]!=max1){
                max2=arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,9};
        int max2=getSecondLargest(arr);
        System.out.println(max2);
    }
}
