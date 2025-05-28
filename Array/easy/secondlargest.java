package Array.easy;

public class secondlargest {
    public int getSecondLargest(int[] arr) {
        // code here
        if (arr.length < 2) {
            return -1; // or throw an exception
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        if(second!=Integer.MIN_VALUE){
            return second;
        }
        return -1;
    }
}
