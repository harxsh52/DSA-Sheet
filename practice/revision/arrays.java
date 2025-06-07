package practice.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class arrays {
    //Easy 
    //7 june 
    //TWO SUM

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> result=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(result.containsKey(target-nums[i])){
                return new int[] {result.get(target-nums[i]),i};
            }
            else{
                result.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }

    // MAX PROFIT
    public int maxProfit(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            max=Math.max(max,nums[i]-min);
        }
        return max;
    }

    //majority Element
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> result=new HashMap<>();
        for(int num:nums){
            result.put(num,result.getOrDefault(num,0)+1);
            if(result.get(num)>nums.length/2){
                return num;
            }
        }
        return -1;
    }

    //Medium
    //7 june

    // overlapping interval
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> merged=new ArrayList<>();
        int[]prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }else{
                merged.add(prev);
            prev=intervals[i];
            }
        }
        merged.add((prev));
        return merged.toArray(new int[merged.size()][]);
    }
    //if not used Arrays.sort
     public void Sort(int[][] intervals){
        for (int i = 0; i < intervals.length; i++) {
    for (int j = i + 1; j < intervals.length; j++) {
        if (intervals[i][0] > intervals[j][0]) {
            // Swap the intervals
            int[] temp = intervals[i];
            intervals[i] = intervals[j];
            intervals[j] = temp;
        }
    }
}
return;
    }

    //Set matrix zero
    public void setZeroes(int[][] matrix) {
        boolean[] row=new boolean[matrix.length];
        boolean[] col=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(row[i]){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(col[i]){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }
        }

        return;
    }

    //3 sum
    
}
