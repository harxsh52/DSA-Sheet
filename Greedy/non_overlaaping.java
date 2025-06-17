package Greedy;

import java.util.Arrays;

public class non_overlaaping {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count=0;
        int[] prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(prev[1]>intervals[i][0]){
                count++;
                prev[1]=Math.min(prev[1],intervals[i][1]);
            }
            else{
                prev=intervals[i];
            }
        }
        return count;
    }
}
