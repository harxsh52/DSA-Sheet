package Sorting;

public class bubble {
    public static void bubble(int[] arr){
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return;
    }
}
