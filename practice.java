import java.util.*;
public class practice {
    public static int secondLargest(int[] arr){
        int first=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else{
                if(arr[i]>second && arr[i]<first){
                    second=arr[i];
                }
            }
        }
        return second==Integer.MIN_VALUE? -1 : second;
    }
    public static void main(String[] args) {
        // This is a simple Java program
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int secondLargest =secondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
        sc.close();
    }


     }
